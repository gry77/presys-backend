package com.gry.presys.mapper;

import com.gry.presys.entities.TCoaDO;
import com.gry.presys.model.AccountType;
import com.gry.presys.model.COAResponse;
import com.gry.presys.model.ChartOfAccount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MasterDataMapper extends EntityMapper {

    public COAResponse mapCOAFromDB(final List<TCoaDO> queryResultList) {
        final List<ChartOfAccount> coaList = new ArrayList<>();
        for (final TCoaDO tCoa : queryResultList) {
            final ChartOfAccount mapped = dozerBeanMapper.map(tCoa, ChartOfAccount.class);
            mapped.setAccountType(dozerBeanMapper.map(tCoa.gettAccountTypeByAccountTypeId(), AccountType.class));

            coaList.add(dozerBeanMapper.map(mapped, ChartOfAccount.class));
        }

        return new COAResponse(coaList);

    }
}
