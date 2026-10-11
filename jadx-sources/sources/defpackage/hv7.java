package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hv7 implements g25 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ wb7 y;
    public final /* synthetic */ String[] z;

    public /* synthetic */ hv7(wb7 wb7Var, String[] strArr, byte b) {
        this.x = b;
        this.y = wb7Var;
        this.z = strArr;
    }

    @Override // defpackage.g25
    public final void accept(Object obj, Object obj2) {
        byte b = this.x;
        String[] strArr = this.z;
        wb7 wb7Var = this.y;
        p76 p76Var = (p76) obj2;
        m08 m08Var = (m08) obj;
        switch (b) {
            case 0:
                wq7 wq7Var = new wq7(wb7Var, p76Var);
                tj7 tj7Var = (tj7) m08Var.m();
                lp i = rv5.i();
                Parcel K = tj7Var.K();
                nn7.c(K, wq7Var);
                K.writeStringArray(strArr);
                nn7.b(K, i);
                tj7Var.O(K, 5);
                return;
            case 1:
                wq7 wq7Var2 = new wq7(wb7Var, p76Var, (byte) 1);
                tj7 tj7Var2 = (tj7) m08Var.m();
                lp i2 = rv5.i();
                Parcel K2 = tj7Var2.K();
                nn7.c(K2, wq7Var2);
                K2.writeStringArray(strArr);
                nn7.b(K2, i2);
                tj7Var2.O(K2, 6);
                return;
            default:
                wq7 wq7Var3 = new wq7(wb7Var, p76Var, (byte) 2);
                tj7 tj7Var3 = (tj7) m08Var.m();
                lp i3 = rv5.i();
                Parcel K3 = tj7Var3.K();
                nn7.c(K3, wq7Var3);
                K3.writeStringArray(strArr);
                nn7.b(K3, i3);
                tj7Var3.O(K3, 7);
                return;
        }
    }
}
