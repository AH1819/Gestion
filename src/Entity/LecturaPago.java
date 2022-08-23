package Entity;

import java.sql.Date;

public class LecturaPago {

    private Integer idLectPago;
    private Date fechaHora;
    private Double lecturaIni;
    private Double lecturaFin;
    private Double consumo;
    private Double importe;
    private Double pagado;
    private Double adeudo;
    private String status;
    private Integer folio_contrato;
    private Integer id_desc;
    private Integer id_m;

    public LecturaPago() {
    }

    public LecturaPago(Integer idLectPago) {
        this.idLectPago = idLectPago;
    }

    public Integer getIdLectPago() {
        return idLectPago;
    }

    public void setIdLectPago(Integer idLectPago) {
        this.idLectPago = idLectPago;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Double getLecturaIni() {
        return lecturaIni;
    }

    public void setLecturaIni(Double lecturaIni) {
        this.lecturaIni = lecturaIni;
    }

    public Double getLecturaFin() {
        return lecturaFin;
    }

    public void setLecturaFin(Double lecturaFin) {
        this.lecturaFin = lecturaFin;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

    public Double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(Double adeudo) {
        this.adeudo = adeudo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFolio_contrato() {
        return folio_contrato;
    }

    public void setFolio_contrato(Integer folio_contrato) {
        this.folio_contrato = folio_contrato;
    }

    public Integer getId_desc() {
        return id_desc;
    }

    public void setId_desc(Integer id_desc) {
        this.id_desc = id_desc;
    }

    public Integer getId_m() {
        return id_m;
    }

    public void setId_m(Integer id_m) {
        this.id_m = id_m;
    }
}
