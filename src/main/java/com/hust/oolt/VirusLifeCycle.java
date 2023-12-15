package com.hust.oolt;

public interface VirusLifeCycle {
    // Hấp thụ (Bám dính)
    public void adsorption();

    // Xâm nhập
    public void penetration();

    // Cởi áo (Giải phóng lõi)
    public void uncoating();

    // Tổng hợp (Sao chép)
    public void replication();

    // Lắp ráp
    public void assembly();

    // Giải phóng
    public void release();
}
