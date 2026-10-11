package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5(with = rp6.class)
/* loaded from: classes2.dex */
public final class op6 implements Serializable {
    public static final np6 Companion = new Object();
    public final String A;
    public final boolean B;
    public final String C;
    public final ArrayList D;
    public final jm6 E;
    public final jm6 F;
    public final d46 G;
    public final d46 H;
    public final d46 I;
    public final d46 J;
    public final d46 K;
    public final String x;
    public final int y;
    public final String z;

    public op6(jm6 jm6Var, String str, int i, ArrayList arrayList, ki4 ki4Var, String str2, String str3, String str4, boolean z, String str5) {
        ki4Var.getClass();
        str2.getClass();
        this.x = str;
        this.y = i;
        this.z = str3;
        this.A = str4;
        this.B = z;
        this.C = str5;
        if (i >= 0 && i < 65536) {
            this.D = arrayList;
            final byte b = 1;
            new d46(new sj5(arrayList, b));
            this.E = jm6Var;
            this.F = jm6Var == null ? jm6.z : jm6Var;
            this.G = new d46(new lb5((Object) arrayList, (Object) this, (byte) 18));
            final byte b2 = 0;
            this.H = new d46(new sb2(this) { // from class: mp6
                public final /* synthetic */ op6 y;

                {
                    this.y = this;
                }

                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b3 = b2;
                    op6 op6Var = this.y;
                    switch (b3) {
                        case 0:
                            String str6 = op6Var.C;
                            int S = uz5.S(str6, '?', 0, 6) + 1;
                            if (S == 0) {
                                return "";
                            }
                            int S2 = uz5.S(str6, '#', S, 4);
                            if (S2 == -1) {
                                return str6.substring(S);
                            }
                            return str6.substring(S, S2);
                        case 1:
                            String str7 = op6Var.C;
                            int S3 = uz5.S(str7, '/', op6Var.F.x.length() + 3, 4);
                            if (S3 == -1) {
                                return "";
                            }
                            int S4 = uz5.S(str7, '#', S3, 4);
                            if (S4 == -1) {
                                return str7.substring(S3);
                            }
                            return str7.substring(S3, S4);
                        case 2:
                            String str8 = op6Var.C;
                            String str9 = op6Var.z;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = op6Var.F.x.length() + 3;
                            return str8.substring(length, uz5.U(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = op6Var.C;
                            String str11 = op6Var.A;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(uz5.S(str10, ':', op6Var.F.x.length() + 3, 4) + 1, uz5.S(str10, '@', 0, 6));
                        default:
                            String str12 = op6Var.C;
                            int S5 = uz5.S(str12, '#', 0, 6) + 1;
                            if (S5 == 0) {
                                return "";
                            }
                            return str12.substring(S5);
                    }
                }
            });
            new d46(new sb2(this) { // from class: mp6
                public final /* synthetic */ op6 y;

                {
                    this.y = this;
                }

                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b3 = b;
                    op6 op6Var = this.y;
                    switch (b3) {
                        case 0:
                            String str6 = op6Var.C;
                            int S = uz5.S(str6, '?', 0, 6) + 1;
                            if (S == 0) {
                                return "";
                            }
                            int S2 = uz5.S(str6, '#', S, 4);
                            if (S2 == -1) {
                                return str6.substring(S);
                            }
                            return str6.substring(S, S2);
                        case 1:
                            String str7 = op6Var.C;
                            int S3 = uz5.S(str7, '/', op6Var.F.x.length() + 3, 4);
                            if (S3 == -1) {
                                return "";
                            }
                            int S4 = uz5.S(str7, '#', S3, 4);
                            if (S4 == -1) {
                                return str7.substring(S3);
                            }
                            return str7.substring(S3, S4);
                        case 2:
                            String str8 = op6Var.C;
                            String str9 = op6Var.z;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = op6Var.F.x.length() + 3;
                            return str8.substring(length, uz5.U(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = op6Var.C;
                            String str11 = op6Var.A;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(uz5.S(str10, ':', op6Var.F.x.length() + 3, 4) + 1, uz5.S(str10, '@', 0, 6));
                        default:
                            String str12 = op6Var.C;
                            int S5 = uz5.S(str12, '#', 0, 6) + 1;
                            if (S5 == 0) {
                                return "";
                            }
                            return str12.substring(S5);
                    }
                }
            });
            final byte b3 = 2;
            this.I = new d46(new sb2(this) { // from class: mp6
                public final /* synthetic */ op6 y;

                {
                    this.y = this;
                }

                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b32 = b3;
                    op6 op6Var = this.y;
                    switch (b32) {
                        case 0:
                            String str6 = op6Var.C;
                            int S = uz5.S(str6, '?', 0, 6) + 1;
                            if (S == 0) {
                                return "";
                            }
                            int S2 = uz5.S(str6, '#', S, 4);
                            if (S2 == -1) {
                                return str6.substring(S);
                            }
                            return str6.substring(S, S2);
                        case 1:
                            String str7 = op6Var.C;
                            int S3 = uz5.S(str7, '/', op6Var.F.x.length() + 3, 4);
                            if (S3 == -1) {
                                return "";
                            }
                            int S4 = uz5.S(str7, '#', S3, 4);
                            if (S4 == -1) {
                                return str7.substring(S3);
                            }
                            return str7.substring(S3, S4);
                        case 2:
                            String str8 = op6Var.C;
                            String str9 = op6Var.z;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = op6Var.F.x.length() + 3;
                            return str8.substring(length, uz5.U(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = op6Var.C;
                            String str11 = op6Var.A;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(uz5.S(str10, ':', op6Var.F.x.length() + 3, 4) + 1, uz5.S(str10, '@', 0, 6));
                        default:
                            String str12 = op6Var.C;
                            int S5 = uz5.S(str12, '#', 0, 6) + 1;
                            if (S5 == 0) {
                                return "";
                            }
                            return str12.substring(S5);
                    }
                }
            });
            final byte b4 = 3;
            this.J = new d46(new sb2(this) { // from class: mp6
                public final /* synthetic */ op6 y;

                {
                    this.y = this;
                }

                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b32 = b4;
                    op6 op6Var = this.y;
                    switch (b32) {
                        case 0:
                            String str6 = op6Var.C;
                            int S = uz5.S(str6, '?', 0, 6) + 1;
                            if (S == 0) {
                                return "";
                            }
                            int S2 = uz5.S(str6, '#', S, 4);
                            if (S2 == -1) {
                                return str6.substring(S);
                            }
                            return str6.substring(S, S2);
                        case 1:
                            String str7 = op6Var.C;
                            int S3 = uz5.S(str7, '/', op6Var.F.x.length() + 3, 4);
                            if (S3 == -1) {
                                return "";
                            }
                            int S4 = uz5.S(str7, '#', S3, 4);
                            if (S4 == -1) {
                                return str7.substring(S3);
                            }
                            return str7.substring(S3, S4);
                        case 2:
                            String str8 = op6Var.C;
                            String str9 = op6Var.z;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = op6Var.F.x.length() + 3;
                            return str8.substring(length, uz5.U(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = op6Var.C;
                            String str11 = op6Var.A;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(uz5.S(str10, ':', op6Var.F.x.length() + 3, 4) + 1, uz5.S(str10, '@', 0, 6));
                        default:
                            String str12 = op6Var.C;
                            int S5 = uz5.S(str12, '#', 0, 6) + 1;
                            if (S5 == 0) {
                                return "";
                            }
                            return str12.substring(S5);
                    }
                }
            });
            final byte b5 = 4;
            this.K = new d46(new sb2(this) { // from class: mp6
                public final /* synthetic */ op6 y;

                {
                    this.y = this;
                }

                @Override // defpackage.sb2
                public final Object invoke() {
                    byte b32 = b5;
                    op6 op6Var = this.y;
                    switch (b32) {
                        case 0:
                            String str6 = op6Var.C;
                            int S = uz5.S(str6, '?', 0, 6) + 1;
                            if (S == 0) {
                                return "";
                            }
                            int S2 = uz5.S(str6, '#', S, 4);
                            if (S2 == -1) {
                                return str6.substring(S);
                            }
                            return str6.substring(S, S2);
                        case 1:
                            String str7 = op6Var.C;
                            int S3 = uz5.S(str7, '/', op6Var.F.x.length() + 3, 4);
                            if (S3 == -1) {
                                return "";
                            }
                            int S4 = uz5.S(str7, '#', S3, 4);
                            if (S4 == -1) {
                                return str7.substring(S3);
                            }
                            return str7.substring(S3, S4);
                        case 2:
                            String str8 = op6Var.C;
                            String str9 = op6Var.z;
                            if (str9 == null) {
                                return null;
                            }
                            if (str9.length() == 0) {
                                return "";
                            }
                            int length = op6Var.F.x.length() + 3;
                            return str8.substring(length, uz5.U(str8, new char[]{':', '@'}, length, false));
                        case 3:
                            String str10 = op6Var.C;
                            String str11 = op6Var.A;
                            if (str11 == null) {
                                return null;
                            }
                            if (str11.length() == 0) {
                                return "";
                            }
                            return str10.substring(uz5.S(str10, ':', op6Var.F.x.length() + 3, 4) + 1, uz5.S(str10, '@', 0, 6));
                        default:
                            String str12 = op6Var.C;
                            int S5 = uz5.S(str12, '#', 0, 6) + 1;
                            if (S5 == 0) {
                                return "";
                            }
                            return str12.substring(S5);
                    }
                }
            });
            return;
        }
        ze0.e(qx1.h(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
        throw null;
    }

    public final int a() {
        int i = this.y;
        Integer valueOf = Integer.valueOf(i);
        if (i == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return this.F.y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && op6.class == obj.getClass()) {
            return this.C.equals(((op6) obj).C);
        }
        return false;
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return this.C;
    }
}
