package Servicio;

import Dao.CatalogosDao;
import Entity.Cat_Consumo;
import Entity.Cat_pago;
import Entity.Cat_periodo;
import java.util.List;

public class CatalogosServicio {

    private CatalogosDao cd = new CatalogosDao();

    public List<Cat_Consumo> GetConsumo() {
        return this.cd.GetConsumo();
    }

    public List<Cat_periodo> GetPeriodo() {
        return this.cd.GetPeriodo();
    }

    public int GetIdconsumo(String consumo) {
        int ret = this.cd.GetIdconsumo(consumo);
        return ret;
    }

    public int GetIdperiodo(String periodo) {
        int ret = this.cd.GetIdperiodo(periodo);
        return ret;
    }

    public List<Cat_pago> Tipo_pago() {
        return this.cd.Tipo_pago();
    }
    public List<Cat_pago> Tipo_pagos() {
        return this.cd.Tipo_pagos();
    }
}