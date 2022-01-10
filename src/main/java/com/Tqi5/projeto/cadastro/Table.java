package com.Tqi5.projeto.cadastro;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@javax.persistence.Table(name = "tbl_cliente")
class cadastro {
    @Id
    @Column(name = "codigo_id", nullable = false)
    private Long codigo_id;

    public Long getCodigo_id() {
        return codigo_id;
    }

    public void setCodigo_id(Long codigo_id) {
        this.codigo_id = codigo_id;
    }
}