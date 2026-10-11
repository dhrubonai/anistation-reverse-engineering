package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lm7 extends ua7 {
    public final qk5 f;
    public final Class g;

    public lm7(qk5 qk5Var) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", (byte) 1);
        this.f = qk5Var;
        this.g = gi0.class;
    }

    @Override // defpackage.ua7
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        Class cls = this.g;
        qk5 qk5Var = this.f;
        switch (i) {
            case 1:
                ic4 ic4Var = new ic4(qk5Var);
                parcel2.writeNoException();
                nn7.c(parcel2, ic4Var);
                return true;
            case 2:
                tt2 L = ic4.L(parcel.readStrongBinder());
                nn7.d(parcel);
                kk5 kk5Var = (kk5) ic4.M(L);
                if (cls.isInstance(kk5Var) && qk5Var != null) {
                    qk5Var.g((kk5) cls.cast(kk5Var));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                tt2 L2 = ic4.L(parcel.readStrongBinder());
                String readString = parcel.readString();
                nn7.d(parcel);
                kk5 kk5Var2 = (kk5) ic4.M(L2);
                if (cls.isInstance(kk5Var2) && qk5Var != null) {
                    qk5Var.f((kk5) cls.cast(kk5Var2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                tt2 L3 = ic4.L(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                nn7.d(parcel);
                kk5 kk5Var3 = (kk5) ic4.M(L3);
                if (cls.isInstance(kk5Var3) && qk5Var != null) {
                    qk5Var.a((kk5) cls.cast(kk5Var3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                tt2 L4 = ic4.L(parcel.readStrongBinder());
                nn7.d(parcel);
                kk5 kk5Var4 = (kk5) ic4.M(L4);
                if (cls.isInstance(kk5Var4) && qk5Var != null) {
                    qk5Var.c((kk5) cls.cast(kk5Var4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                tt2 L5 = ic4.L(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                nn7.d(parcel);
                kk5 kk5Var5 = (kk5) ic4.M(L5);
                if (cls.isInstance(kk5Var5) && qk5Var != null) {
                    qk5Var.b((kk5) cls.cast(kk5Var5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                tt2 L6 = ic4.L(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                nn7.d(parcel);
                kk5 kk5Var6 = (kk5) ic4.M(L6);
                if (cls.isInstance(kk5Var6) && qk5Var != null) {
                    qk5Var.h((kk5) cls.cast(kk5Var6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                tt2 L7 = ic4.L(parcel.readStrongBinder());
                int i2 = nn7.a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                nn7.d(parcel);
                kk5 kk5Var7 = (kk5) ic4.M(L7);
                if (cls.isInstance(kk5Var7) && qk5Var != null) {
                    qk5Var.e((kk5) cls.cast(kk5Var7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                tt2 L8 = ic4.L(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                nn7.d(parcel);
                kk5 kk5Var8 = (kk5) ic4.M(L8);
                if (cls.isInstance(kk5Var8) && qk5Var != null) {
                    qk5Var.d((kk5) cls.cast(kk5Var8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                tt2 L9 = ic4.L(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                nn7.d(parcel);
                kk5 kk5Var9 = (kk5) ic4.M(L9);
                if (cls.isInstance(kk5Var9) && qk5Var != null) {
                    qk5Var.i((kk5) cls.cast(kk5Var9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
