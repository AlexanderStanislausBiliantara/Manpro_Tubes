package com.example.manpro.Agen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepositoryAgen implements AgenRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addUnit(String kodeUnit, String tipe, String noUnit, boolean status, double tarif, String nikAgen, String noLantai, String namaTower) {
        // String kodeUnit = namaTower+noLantai+noUnit;
        // String tipe;
        // String noUnit;
        // boolean status = true;
        // double tarif;
        // String nikAgen = agen.getNikAgen();
        // String noLantai;
        // String namaTower;
        String sql = "INSERT INTO Unit (kodeUnit, tipe, noUnit, status, tarif, NIKAgen, noLantai, namaTower) VALUES (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, kodeUnit, tipe, noUnit, status, tarif, nikAgen, noLantai, namaTower);
    }
    
}
