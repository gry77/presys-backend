package com.gry.presys.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_COA", schema = "main")
public class TCoaDO {
    private Long id;
    private String code;
    private String name;
    private Short enabled;
    private Short accountTypeId;
    private TAccountTypeDO tAccountTypeByAccountTypeId;

    @Id
    @Column(name = "ID")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "ENABLED")
    public Short getEnabled() {
        return enabled;
    }

    public void setEnabled(final Short enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "ACCOUNT_TYPE_ID")
    public Short getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(final Short accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        final TCoaDO tCoaDO = (TCoaDO) o;

        if (id != null ? !id.equals(tCoaDO.id) : tCoaDO.id != null)
            return false;
        if (code != null ? !code.equals(tCoaDO.code) : tCoaDO.code != null)
            return false;
        if (name != null ? !name.equals(tCoaDO.name) : tCoaDO.name != null)
            return false;
        if (enabled != null ? !enabled.equals(tCoaDO.enabled) : tCoaDO.enabled != null)
            return false;
        if (accountTypeId != null ? !accountTypeId.equals(tCoaDO.accountTypeId) : tCoaDO.accountTypeId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (enabled != null ? enabled.hashCode() : 0);
        result = 31 * result + (accountTypeId != null ? accountTypeId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_TYPE_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    public TAccountTypeDO gettAccountTypeByAccountTypeId() {
        return tAccountTypeByAccountTypeId;
    }

    public void settAccountTypeByAccountTypeId(final TAccountTypeDO tAccountTypeByAccountTypeId) {
        this.tAccountTypeByAccountTypeId = tAccountTypeByAccountTypeId;
    }
}
