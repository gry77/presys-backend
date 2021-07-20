package com.gry.presys.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "T_ACCOUNT_TYPE", schema = "main")
public class TAccountTypeDO {
    private Short id;
    private String name;
    private Collection<TCoaDO> tCoasById;

    @Id
    @Column(name = "ID")
    public Short getId() {
        return id;
    }

    public void setId(final Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        final TAccountTypeDO that = (TAccountTypeDO) o;

        if (id != null ? !id.equals(that.id) : that.id != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "tAccountTypeByAccountTypeId")
    public Collection<TCoaDO> gettCoasById() {
        return tCoasById;
    }

    public void settCoasById(final Collection<TCoaDO> tCoasById) {
        this.tCoasById = tCoasById;
    }
}
