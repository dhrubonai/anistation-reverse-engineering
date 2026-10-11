package defpackage;

import android.accounts.Account;
import android.net.Network;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aw7 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ aw7(byte b) {
        this.a = b;
    }

    public static void a(he2 he2Var, Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        int i2 = he2Var.x;
        z51.r0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = he2Var.y;
        z51.r0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = he2Var.z;
        z51.r0(parcel, 3, 4);
        parcel.writeInt(i4);
        z51.m0(parcel, 4, he2Var.A);
        z51.c0(parcel, 5, he2Var.B);
        z51.o0(parcel, 6, he2Var.C, i);
        z51.Z(parcel, 7, he2Var.D);
        z51.l0(parcel, 8, he2Var.E, i);
        z51.o0(parcel, 10, he2Var.F, i);
        z51.o0(parcel, 11, he2Var.G, i);
        boolean z = he2Var.H;
        z51.r0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = he2Var.I;
        z51.r0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = he2Var.J;
        z51.r0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        z51.m0(parcel, 15, he2Var.K);
        z51.t0(parcel, s0);
    }

    public static void b(e28 e28Var, Parcel parcel) {
        int i = e28Var.x;
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 1, 4);
        parcel.writeInt(i);
        z51.m0(parcel, 2, e28Var.y);
        long j = e28Var.z;
        z51.r0(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = e28Var.A;
        if (l != null) {
            z51.r0(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        z51.m0(parcel, 6, e28Var.B);
        z51.m0(parcel, 7, e28Var.C);
        Double d = e28Var.D;
        if (d != null) {
            z51.r0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        z51.t0(parcel, s0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, jv7] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long j = 0;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Bundle bundle = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        switch (this.a) {
            case 0:
                int j0 = h41.j0(parcel);
                double d = 0.0d;
                long j2 = 0;
                String str4 = null;
                String str5 = null;
                byte[] bArr = null;
                boolean z3 = false;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (parcel.dataPosition() < j0) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 2:
                            str4 = h41.t(parcel, readInt);
                            break;
                        case 3:
                            j2 = h41.V(parcel, readInt);
                            break;
                        case 4:
                            z3 = h41.P(parcel, readInt);
                            break;
                        case 5:
                            d = h41.R(parcel, readInt);
                            break;
                        case 6:
                            str5 = h41.t(parcel, readInt);
                            break;
                        case 7:
                            bArr = h41.n(parcel, readInt);
                            break;
                        case '\b':
                            i6 = h41.T(parcel, readInt);
                            break;
                        case '\t':
                            i7 = h41.T(parcel, readInt);
                            break;
                        case '\n':
                            i8 = h41.T(parcel, readInt);
                            break;
                        default:
                            h41.a0(parcel, readInt);
                            break;
                    }
                }
                h41.z(parcel, j0);
                return new zv7(str4, j2, z3, d, str5, bArr, i6, i7, i8);
            case 1:
                int j02 = h41.j0(parcel);
                String str6 = null;
                zv7 zv7Var = null;
                while (parcel.dataPosition() < j02) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c != 5) {
                                    h41.a0(parcel, readInt2);
                                } else {
                                    z = h41.P(parcel, readInt2);
                                }
                            } else {
                                zv7Var = (zv7) h41.s(parcel, readInt2, zv7.CREATOR);
                            }
                        } else {
                            str6 = h41.t(parcel, readInt2);
                        }
                    } else {
                        str = h41.t(parcel, readInt2);
                    }
                }
                h41.z(parcel, j02);
                return new bw7(str, str6, zv7Var, z);
            case 2:
                int j03 = h41.j0(parcel);
                while (parcel.dataPosition() < j03) {
                    int readInt3 = parcel.readInt();
                    if (((char) readInt3) != 2) {
                        h41.a0(parcel, readInt3);
                    } else {
                        arrayList3 = h41.w(parcel, readInt3, bw7.CREATOR);
                    }
                }
                h41.z(parcel, j03);
                return new ew7(arrayList3);
            case 3:
                int j04 = h41.j0(parcel);
                int i9 = 0;
                while (parcel.dataPosition() < j04) {
                    int readInt4 = parcel.readInt();
                    char c2 = (char) readInt4;
                    if (c2 != 1) {
                        if (c2 != 2) {
                            h41.a0(parcel, readInt4);
                        } else {
                            i9 = h41.T(parcel, readInt4);
                        }
                    } else {
                        i5 = h41.T(parcel, readInt4);
                    }
                }
                h41.z(parcel, j04);
                return new hw7(i5, i9);
            case 4:
                int j05 = h41.j0(parcel);
                q12[] q12VarArr = null;
                mw0 mw0Var = null;
                while (parcel.dataPosition() < j05) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    h41.a0(parcel, readInt5);
                                } else {
                                    mw0Var = (mw0) h41.s(parcel, readInt5, mw0.CREATOR);
                                }
                            } else {
                                i4 = h41.T(parcel, readInt5);
                            }
                        } else {
                            q12VarArr = (q12[]) h41.v(parcel, readInt5, q12.CREATOR);
                        }
                    } else {
                        bundle = h41.m(parcel, readInt5);
                    }
                }
                h41.z(parcel, j05);
                ?? obj = new Object();
                obj.x = bundle;
                obj.y = q12VarArr;
                obj.z = i4;
                obj.A = mw0Var;
                return obj;
            case 5:
                int j06 = h41.j0(parcel);
                j75 j75Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z4 = false;
                boolean z5 = false;
                int i10 = 0;
                while (parcel.dataPosition() < j06) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            j75Var = (j75) h41.s(parcel, readInt6, j75.CREATOR);
                            break;
                        case 2:
                            z4 = h41.P(parcel, readInt6);
                            break;
                        case 3:
                            z5 = h41.P(parcel, readInt6);
                            break;
                        case 4:
                            iArr = h41.p(parcel, readInt6);
                            break;
                        case 5:
                            i10 = h41.T(parcel, readInt6);
                            break;
                        case 6:
                            iArr2 = h41.p(parcel, readInt6);
                            break;
                        default:
                            h41.a0(parcel, readInt6);
                            break;
                    }
                }
                h41.z(parcel, j06);
                return new mw0(j75Var, z4, z5, iArr, i10, iArr2);
            case 6:
                int j07 = h41.j0(parcel);
                while (parcel.dataPosition() < j07) {
                    int readInt7 = parcel.readInt();
                    if (((char) readInt7) != 2) {
                        h41.a0(parcel, readInt7);
                    } else {
                        z2 = h41.P(parcel, readInt7);
                    }
                }
                h41.z(parcel, j07);
                return new qw7(z2);
            case 7:
                int j08 = h41.j0(parcel);
                Bundle bundle2 = new Bundle();
                Scope[] scopeArr = he2.L;
                q12[] q12VarArr2 = he2.M;
                q12[] q12VarArr3 = q12VarArr2;
                String str7 = null;
                IBinder iBinder = null;
                Account account = null;
                String str8 = null;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z6 = false;
                int i14 = 0;
                boolean z7 = false;
                while (parcel.dataPosition() < j08) {
                    int readInt8 = parcel.readInt();
                    switch ((char) readInt8) {
                        case 1:
                            i11 = h41.T(parcel, readInt8);
                            break;
                        case 2:
                            i12 = h41.T(parcel, readInt8);
                            break;
                        case 3:
                            i13 = h41.T(parcel, readInt8);
                            break;
                        case 4:
                            str7 = h41.t(parcel, readInt8);
                            break;
                        case 5:
                            iBinder = h41.S(parcel, readInt8);
                            break;
                        case 6:
                            scopeArr = (Scope[]) h41.v(parcel, readInt8, Scope.CREATOR);
                            break;
                        case 7:
                            bundle2 = h41.m(parcel, readInt8);
                            break;
                        case '\b':
                            account = (Account) h41.s(parcel, readInt8, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            h41.a0(parcel, readInt8);
                            break;
                        case '\n':
                            q12VarArr2 = (q12[]) h41.v(parcel, readInt8, q12.CREATOR);
                            break;
                        case 11:
                            q12VarArr3 = (q12[]) h41.v(parcel, readInt8, q12.CREATOR);
                            break;
                        case '\f':
                            z6 = h41.P(parcel, readInt8);
                            break;
                        case '\r':
                            i14 = h41.T(parcel, readInt8);
                            break;
                        case 14:
                            z7 = h41.P(parcel, readInt8);
                            break;
                        case 15:
                            str8 = h41.t(parcel, readInt8);
                            break;
                    }
                }
                h41.z(parcel, j08);
                return new he2(i11, i12, i13, str7, iBinder, scopeArr, bundle2, account, q12VarArr2, q12VarArr3, z6, i14, z7, str8);
            case 8:
                int j09 = h41.j0(parcel);
                while (parcel.dataPosition() < j09) {
                    int readInt9 = parcel.readInt();
                    if (((char) readInt9) != 2) {
                        h41.a0(parcel, readInt9);
                    } else {
                        i3 = h41.T(parcel, readInt9);
                    }
                }
                h41.z(parcel, j09);
                return new my7(i3);
            case 9:
                int j010 = h41.j0(parcel);
                double d2 = 0.0d;
                String str9 = null;
                ArrayList arrayList4 = null;
                aa3 aa3Var = null;
                zh0 zh0Var = null;
                ArrayList arrayList5 = null;
                qw7 qw7Var = null;
                my7 my7Var = null;
                boolean z8 = false;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                boolean z17 = false;
                while (parcel.dataPosition() < j010) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            str9 = h41.t(parcel, readInt10);
                            break;
                        case 3:
                            arrayList4 = h41.u(parcel, readInt10);
                            break;
                        case 4:
                            z8 = h41.P(parcel, readInt10);
                            break;
                        case 5:
                            aa3Var = (aa3) h41.s(parcel, readInt10, aa3.CREATOR);
                            break;
                        case 6:
                            z9 = h41.P(parcel, readInt10);
                            break;
                        case 7:
                            zh0Var = (zh0) h41.s(parcel, readInt10, zh0.CREATOR);
                            break;
                        case '\b':
                            z10 = h41.P(parcel, readInt10);
                            break;
                        case '\t':
                            d2 = h41.R(parcel, readInt10);
                            break;
                        case '\n':
                            z11 = h41.P(parcel, readInt10);
                            break;
                        case 11:
                            z12 = h41.P(parcel, readInt10);
                            break;
                        case '\f':
                            z13 = h41.P(parcel, readInt10);
                            break;
                        case '\r':
                            arrayList5 = h41.u(parcel, readInt10);
                            break;
                        case 14:
                            z14 = h41.P(parcel, readInt10);
                            break;
                        case 15:
                            h41.T(parcel, readInt10);
                            break;
                        case 16:
                            z15 = h41.P(parcel, readInt10);
                            break;
                        case 17:
                            qw7Var = (qw7) h41.s(parcel, readInt10, qw7.CREATOR);
                            break;
                        case 18:
                            my7Var = (my7) h41.s(parcel, readInt10, my7.CREATOR);
                            break;
                        case 19:
                            z16 = h41.P(parcel, readInt10);
                            break;
                        case 20:
                            z17 = h41.P(parcel, readInt10);
                            break;
                        default:
                            h41.a0(parcel, readInt10);
                            break;
                    }
                }
                h41.z(parcel, j010);
                return new di0(str9, arrayList4, z8, aa3Var, z9, zh0Var, z10, d2, z11, z12, z13, arrayList5, z14, z15, qw7Var, my7Var, z16, z17);
            case 10:
                int j011 = h41.j0(parcel);
                while (parcel.dataPosition() < j011) {
                    int readInt11 = parcel.readInt();
                    char c4 = (char) readInt11;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                h41.a0(parcel, readInt11);
                            } else {
                                i2 = h41.T(parcel, readInt11);
                            }
                        } else {
                            j = h41.V(parcel, readInt11);
                        }
                    } else {
                        str3 = h41.t(parcel, readInt11);
                    }
                }
                h41.z(parcel, j011);
                return new x08(j, i2, str3);
            case 11:
                int j012 = h41.j0(parcel);
                long j3 = 0;
                long j4 = 0;
                byte[] bArr2 = null;
                String str10 = null;
                Bundle bundle3 = null;
                String str11 = null;
                int i15 = 0;
                while (parcel.dataPosition() < j012) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 1:
                            j3 = h41.V(parcel, readInt12);
                            break;
                        case 2:
                            bArr2 = h41.n(parcel, readInt12);
                            break;
                        case 3:
                            str10 = h41.t(parcel, readInt12);
                            break;
                        case 4:
                            bundle3 = h41.m(parcel, readInt12);
                            break;
                        case 5:
                            i15 = h41.T(parcel, readInt12);
                            break;
                        case 6:
                            j4 = h41.V(parcel, readInt12);
                            break;
                        case 7:
                            str11 = h41.t(parcel, readInt12);
                            break;
                        default:
                            h41.a0(parcel, readInt12);
                            break;
                    }
                }
                h41.z(parcel, j012);
                return new c18(j3, bArr2, str10, bundle3, i15, j4, str11);
            case 12:
                int j013 = h41.j0(parcel);
                while (parcel.dataPosition() < j013) {
                    int readInt13 = parcel.readInt();
                    if (((char) readInt13) != 1) {
                        h41.a0(parcel, readInt13);
                    } else {
                        arrayList2 = h41.q(parcel, readInt13);
                    }
                }
                h41.z(parcel, j013);
                return new e18(arrayList2);
            case 13:
                int j014 = h41.j0(parcel);
                while (parcel.dataPosition() < j014) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 1) {
                        h41.a0(parcel, readInt14);
                    } else {
                        arrayList = h41.w(parcel, readInt14, c18.CREATOR);
                    }
                }
                h41.z(parcel, j014);
                return new h18(arrayList);
            case 14:
                int j015 = h41.j0(parcel);
                long j5 = 0;
                String str12 = null;
                Long l = null;
                Float f = null;
                String str13 = null;
                String str14 = null;
                Double d3 = null;
                int i16 = 0;
                while (parcel.dataPosition() < j015) {
                    int readInt15 = parcel.readInt();
                    switch ((char) readInt15) {
                        case 1:
                            i16 = h41.T(parcel, readInt15);
                            break;
                        case 2:
                            str12 = h41.t(parcel, readInt15);
                            break;
                        case 3:
                            j5 = h41.V(parcel, readInt15);
                            break;
                        case 4:
                            int W = h41.W(parcel, readInt15);
                            if (W == 0) {
                                l = null;
                                break;
                            } else {
                                h41.s0(parcel, W, 8);
                                l = Long.valueOf(parcel.readLong());
                                break;
                            }
                        case 5:
                            int W2 = h41.W(parcel, readInt15);
                            if (W2 == 0) {
                                f = null;
                                break;
                            } else {
                                h41.s0(parcel, W2, 4);
                                f = Float.valueOf(parcel.readFloat());
                                break;
                            }
                        case 6:
                            str13 = h41.t(parcel, readInt15);
                            break;
                        case 7:
                            str14 = h41.t(parcel, readInt15);
                            break;
                        case '\b':
                            int W3 = h41.W(parcel, readInt15);
                            if (W3 == 0) {
                                d3 = null;
                                break;
                            } else {
                                h41.s0(parcel, W3, 8);
                                d3 = Double.valueOf(parcel.readDouble());
                                break;
                            }
                        default:
                            h41.a0(parcel, readInt15);
                            break;
                    }
                }
                h41.z(parcel, j015);
                return new e28(i16, str12, j5, l, f, str13, str14, d3);
            case 15:
                int j016 = h41.j0(parcel);
                String str15 = null;
                while (parcel.dataPosition() < j016) {
                    int readInt16 = parcel.readInt();
                    char c5 = (char) readInt16;
                    if (c5 != 2) {
                        if (c5 != 3) {
                            if (c5 != 4) {
                                h41.a0(parcel, readInt16);
                            } else {
                                str15 = h41.t(parcel, readInt16);
                            }
                        } else {
                            i = h41.T(parcel, readInt16);
                        }
                    } else {
                        str2 = h41.t(parcel, readInt16);
                    }
                }
                h41.z(parcel, j016);
                return new ab4(str2, i, str15);
            case 16:
                int j017 = h41.j0(parcel);
                int i17 = -1;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                ArrayList arrayList6 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                byte[] bArr3 = null;
                String str24 = null;
                oc7 oc7Var = null;
                Integer num = null;
                Boolean bool = null;
                Network network = null;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                boolean z18 = false;
                while (parcel.dataPosition() < j017) {
                    int readInt17 = parcel.readInt();
                    switch ((char) readInt17) {
                        case 2:
                            str16 = h41.t(parcel, readInt17);
                            break;
                        case 3:
                            str17 = h41.t(parcel, readInt17);
                            break;
                        case 4:
                            str18 = h41.t(parcel, readInt17);
                            break;
                        case 5:
                            str19 = h41.t(parcel, readInt17);
                            break;
                        case 6:
                            str20 = h41.t(parcel, readInt17);
                            break;
                        case 7:
                            i18 = h41.T(parcel, readInt17);
                            break;
                        case '\b':
                            arrayList6 = h41.w(parcel, readInt17, e37.CREATOR);
                            break;
                        case '\t':
                            i19 = h41.T(parcel, readInt17);
                            break;
                        case '\n':
                            i17 = h41.T(parcel, readInt17);
                            break;
                        case 11:
                            str21 = h41.t(parcel, readInt17);
                            break;
                        case '\f':
                            str22 = h41.t(parcel, readInt17);
                            break;
                        case '\r':
                            i20 = h41.T(parcel, readInt17);
                            break;
                        case 14:
                            str23 = h41.t(parcel, readInt17);
                            break;
                        case 15:
                            bArr3 = h41.n(parcel, readInt17);
                            break;
                        case 16:
                            str24 = h41.t(parcel, readInt17);
                            break;
                        case 17:
                            z18 = h41.P(parcel, readInt17);
                            break;
                        case 18:
                            oc7Var = (oc7) h41.s(parcel, readInt17, oc7.CREATOR);
                            break;
                        case 19:
                            num = h41.U(parcel, readInt17);
                            break;
                        case 20:
                            bool = h41.Q(parcel, readInt17);
                            break;
                        case 21:
                            network = (Network) h41.s(parcel, readInt17, Network.CREATOR);
                            break;
                        default:
                            h41.a0(parcel, readInt17);
                            break;
                    }
                }
                h41.z(parcel, j017);
                return new CastDevice(str16, str17, str18, str19, str20, i18, arrayList6, i19, i17, str21, str22, i20, str23, bArr3, str24, z18, oc7Var, num, bool, network);
            case 17:
                int j018 = h41.j0(parcel);
                long j6 = -1;
                String str25 = null;
                boolean z19 = false;
                int i21 = 0;
                int i22 = 0;
                while (parcel.dataPosition() < j018) {
                    int readInt18 = parcel.readInt();
                    char c6 = (char) readInt18;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                if (c6 != 4) {
                                    if (c6 != 5) {
                                        h41.a0(parcel, readInt18);
                                    } else {
                                        j6 = h41.V(parcel, readInt18);
                                    }
                                } else {
                                    i22 = h41.T(parcel, readInt18);
                                }
                            } else {
                                i21 = h41.T(parcel, readInt18);
                            }
                        } else {
                            str25 = h41.t(parcel, readInt18);
                        }
                    } else {
                        z19 = h41.P(parcel, readInt18);
                    }
                }
                h41.z(parcel, j018);
                return new z38(z19, str25, i21, i22, j6);
            case 18:
                int j019 = h41.j0(parcel);
                String str26 = "";
                String str27 = str26;
                String str28 = str27;
                String str29 = str28;
                int i23 = 100;
                long j7 = -2147483648L;
                long j8 = 0;
                long j9 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                boolean z20 = true;
                boolean z21 = true;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                Boolean bool2 = null;
                ArrayList arrayList7 = null;
                String str36 = null;
                String str37 = null;
                boolean z22 = false;
                int i24 = 0;
                boolean z23 = false;
                boolean z24 = false;
                int i25 = 0;
                int i26 = 0;
                while (parcel.dataPosition() < j019) {
                    int readInt19 = parcel.readInt();
                    switch ((char) readInt19) {
                        case 2:
                            str30 = h41.t(parcel, readInt19);
                            break;
                        case 3:
                            str31 = h41.t(parcel, readInt19);
                            break;
                        case 4:
                            str32 = h41.t(parcel, readInt19);
                            break;
                        case 5:
                            str33 = h41.t(parcel, readInt19);
                            break;
                        case 6:
                            j8 = h41.V(parcel, readInt19);
                            break;
                        case 7:
                            j9 = h41.V(parcel, readInt19);
                            break;
                        case '\b':
                            str34 = h41.t(parcel, readInt19);
                            break;
                        case '\t':
                            z20 = h41.P(parcel, readInt19);
                            break;
                        case '\n':
                            z22 = h41.P(parcel, readInt19);
                            break;
                        case 11:
                            j7 = h41.V(parcel, readInt19);
                            break;
                        case '\f':
                            str35 = h41.t(parcel, readInt19);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            h41.a0(parcel, readInt19);
                            break;
                        case 14:
                            j10 = h41.V(parcel, readInt19);
                            break;
                        case 15:
                            i24 = h41.T(parcel, readInt19);
                            break;
                        case 16:
                            z21 = h41.P(parcel, readInt19);
                            break;
                        case 18:
                            z23 = h41.P(parcel, readInt19);
                            break;
                        case 21:
                            bool2 = h41.Q(parcel, readInt19);
                            break;
                        case 22:
                            j11 = h41.V(parcel, readInt19);
                            break;
                        case 23:
                            arrayList7 = h41.u(parcel, readInt19);
                            break;
                        case 25:
                            str26 = h41.t(parcel, readInt19);
                            break;
                        case 26:
                            str27 = h41.t(parcel, readInt19);
                            break;
                        case 27:
                            str36 = h41.t(parcel, readInt19);
                            break;
                        case 28:
                            z24 = h41.P(parcel, readInt19);
                            break;
                        case 29:
                            j12 = h41.V(parcel, readInt19);
                            break;
                        case 30:
                            i23 = h41.T(parcel, readInt19);
                            break;
                        case 31:
                            str28 = h41.t(parcel, readInt19);
                            break;
                        case ' ':
                            i25 = h41.T(parcel, readInt19);
                            break;
                        case '\"':
                            j13 = h41.V(parcel, readInt19);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            str37 = h41.t(parcel, readInt19);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                            str29 = h41.t(parcel, readInt19);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                            j14 = h41.V(parcel, readInt19);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                            i26 = h41.T(parcel, readInt19);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                            j15 = h41.V(parcel, readInt19);
                            break;
                    }
                }
                h41.z(parcel, j019);
                return new b48(str30, str31, str32, str33, j8, j9, str34, z20, z22, j7, str35, j10, i24, z21, z23, bool2, j11, arrayList7, str26, str27, str36, z24, j12, i23, str28, i25, j13, str37, str29, j14, i26, j15);
            default:
                int j020 = h41.j0(parcel);
                long j16 = 0;
                ArrayList arrayList8 = null;
                int[] iArr3 = null;
                String str38 = null;
                IBinder iBinder2 = null;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                int i39 = 0;
                int i40 = 0;
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                boolean z25 = false;
                boolean z26 = false;
                while (parcel.dataPosition() < j020) {
                    int readInt20 = parcel.readInt();
                    switch ((char) readInt20) {
                        case 2:
                            arrayList8 = h41.u(parcel, readInt20);
                            break;
                        case 3:
                            iArr3 = h41.p(parcel, readInt20);
                            break;
                        case 4:
                            j16 = h41.V(parcel, readInt20);
                            break;
                        case 5:
                            str38 = h41.t(parcel, readInt20);
                            break;
                        case 6:
                            i27 = h41.T(parcel, readInt20);
                            break;
                        case 7:
                            i28 = h41.T(parcel, readInt20);
                            break;
                        case '\b':
                            i29 = h41.T(parcel, readInt20);
                            break;
                        case '\t':
                            i30 = h41.T(parcel, readInt20);
                            break;
                        case '\n':
                            i31 = h41.T(parcel, readInt20);
                            break;
                        case 11:
                            i32 = h41.T(parcel, readInt20);
                            break;
                        case '\f':
                            i33 = h41.T(parcel, readInt20);
                            break;
                        case '\r':
                            i34 = h41.T(parcel, readInt20);
                            break;
                        case 14:
                            i35 = h41.T(parcel, readInt20);
                            break;
                        case 15:
                            i36 = h41.T(parcel, readInt20);
                            break;
                        case 16:
                            i37 = h41.T(parcel, readInt20);
                            break;
                        case 17:
                            i38 = h41.T(parcel, readInt20);
                            break;
                        case 18:
                            i39 = h41.T(parcel, readInt20);
                            break;
                        case 19:
                            i40 = h41.T(parcel, readInt20);
                            break;
                        case 20:
                            i41 = h41.T(parcel, readInt20);
                            break;
                        case 21:
                            i42 = h41.T(parcel, readInt20);
                            break;
                        case 22:
                            i43 = h41.T(parcel, readInt20);
                            break;
                        case 23:
                            i44 = h41.T(parcel, readInt20);
                            break;
                        case 24:
                            i45 = h41.T(parcel, readInt20);
                            break;
                        case 25:
                            i46 = h41.T(parcel, readInt20);
                            break;
                        case 26:
                            i47 = h41.T(parcel, readInt20);
                            break;
                        case 27:
                            i48 = h41.T(parcel, readInt20);
                            break;
                        case 28:
                            i49 = h41.T(parcel, readInt20);
                            break;
                        case 29:
                            i50 = h41.T(parcel, readInt20);
                            break;
                        case 30:
                            i51 = h41.T(parcel, readInt20);
                            break;
                        case 31:
                            i52 = h41.T(parcel, readInt20);
                            break;
                        case ' ':
                            i53 = h41.T(parcel, readInt20);
                            break;
                        case '!':
                            iBinder2 = h41.S(parcel, readInt20);
                            break;
                        case '\"':
                            z25 = h41.P(parcel, readInt20);
                            break;
                        case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                            z26 = h41.P(parcel, readInt20);
                            break;
                        default:
                            h41.a0(parcel, readInt20);
                            break;
                    }
                }
                h41.z(parcel, j020);
                return new ob4(arrayList8, iArr3, j16, str38, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45, i46, i47, i48, i49, i50, i51, i52, i53, iBinder2, z25, z26);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zv7[i];
            case 1:
                return new bw7[i];
            case 2:
                return new ew7[i];
            case 3:
                return new hw7[i];
            case 4:
                return new jv7[i];
            case 5:
                return new mw0[i];
            case 6:
                return new qw7[i];
            case 7:
                return new he2[i];
            case 8:
                return new my7[i];
            case 9:
                return new di0[i];
            case 10:
                return new x08[i];
            case 11:
                return new c18[i];
            case 12:
                return new e18[i];
            case 13:
                return new h18[i];
            case 14:
                return new e28[i];
            case 15:
                return new ab4[i];
            case 16:
                return new CastDevice[i];
            case 17:
                return new z38[i];
            case 18:
                return new b48[i];
            default:
                return new ob4[i];
        }
    }
}
