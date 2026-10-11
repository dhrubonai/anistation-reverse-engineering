package defpackage;

import android.os.Build;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class iu7 extends mf7 {
    private static final iu7 zzaw;
    private static volatile sg7 zzax;
    private long zzA;
    private int zzB;
    private String zzC;
    private String zzD;
    private boolean zzE;
    private yf7 zzF;
    private String zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private String zzK;
    private long zzL;
    private long zzM;
    private String zzN;
    private String zzO;
    private int zzP;
    private String zzQ;
    private ou7 zzR;
    private tf7 zzS;
    private long zzT;
    private long zzU;
    private String zzV;
    private String zzW;
    private int zzX;
    private boolean zzY;
    private String zzZ;
    private boolean zzaa;
    private xt7 zzab;
    private String zzac;
    private yf7 zzad;
    private String zzae;
    private long zzaf;
    private boolean zzag;
    private String zzah;
    private boolean zzai;
    private String zzaj;
    private int zzak;
    private String zzal;
    private ws7 zzam;
    private int zzan;
    private qs7 zzao;
    private String zzap;
    private av7 zzaq;
    private long zzar;
    private String zzas;
    private gt7 zzat;
    private String zzau;
    private yf7 zzav;
    private int zzb;
    private int zze;
    private int zzf;
    private yf7 zzg;
    private yf7 zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private int zzr;
    private String zzs;
    private String zzt;
    private String zzu;
    private long zzv;
    private long zzw;
    private String zzx;
    private boolean zzy;
    private String zzz;

    static {
        iu7 iu7Var = new iu7();
        zzaw = iu7Var;
        mf7.m(iu7.class, iu7Var);
    }

    public iu7() {
        vg7 vg7Var = vg7.B;
        this.zzg = vg7Var;
        this.zzh = vg7Var;
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzs = "";
        this.zzt = "";
        this.zzu = "";
        this.zzx = "";
        this.zzz = "";
        this.zzC = "";
        this.zzD = "";
        this.zzF = vg7Var;
        this.zzG = "";
        this.zzK = "";
        this.zzN = "";
        this.zzO = "";
        this.zzQ = "";
        this.zzS = nf7.B;
        this.zzV = "";
        this.zzW = "";
        this.zzZ = "";
        this.zzac = "";
        this.zzad = vg7Var;
        this.zzae = "";
        this.zzah = "";
        this.zzaj = "";
        this.zzal = "";
        this.zzap = "";
        this.zzas = "";
        this.zzau = "";
        this.zzav = vg7Var;
    }

    public static fu7 W() {
        return (fu7) zzaw.h();
    }

    public static fu7 X(iu7 iu7Var) {
        kf7 h = zzaw.h();
        h.f(iu7Var);
        return (fu7) h;
    }

    public final String A() {
        return this.zzz;
    }

    public final long A0() {
        return this.zzaf;
    }

    public final /* synthetic */ void A1(String str) {
        str.getClass();
        this.zzb |= 65536;
        this.zzx = str;
    }

    public final boolean B() {
        if ((this.zzb & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean B0() {
        return this.zzag;
    }

    public final /* synthetic */ void B1() {
        this.zzb &= -65537;
        this.zzx = zzaw.zzx;
    }

    public final long C() {
        return this.zzA;
    }

    public final boolean C0() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void C1(boolean z) {
        this.zzb |= 131072;
        this.zzy = z;
    }

    public final boolean D() {
        if ((this.zzb & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final String D0() {
        return this.zzah;
    }

    public final /* synthetic */ void D1() {
        this.zzb &= -131073;
        this.zzy = false;
    }

    public final int E() {
        return this.zzB;
    }

    public final boolean E0() {
        if ((this.zze & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void E1(String str) {
        this.zzb |= 262144;
        this.zzz = str;
    }

    public final String F() {
        return this.zzC;
    }

    public final boolean F0() {
        return this.zzai;
    }

    public final /* synthetic */ void F1() {
        this.zzb &= -262145;
        this.zzz = zzaw.zzz;
    }

    public final String G() {
        return this.zzD;
    }

    public final boolean G0() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void G1(long j) {
        this.zzb |= 524288;
        this.zzA = j;
    }

    public final boolean H() {
        if ((this.zzb & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final String H0() {
        return this.zzaj;
    }

    public final /* synthetic */ void H1(int i) {
        this.zzb |= 1048576;
        this.zzB = i;
    }

    public final boolean I() {
        return this.zzE;
    }

    public final int I0() {
        return this.zzak;
    }

    public final /* synthetic */ void I1(String str) {
        this.zzb |= 2097152;
        this.zzC = str;
    }

    public final yf7 J() {
        return this.zzF;
    }

    public final boolean J0() {
        if ((this.zze & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void J1() {
        this.zzb &= -2097153;
        this.zzC = zzaw.zzC;
    }

    public final String K() {
        return this.zzG;
    }

    public final ws7 K0() {
        ws7 ws7Var = this.zzam;
        if (ws7Var == null) {
            return ws7.z();
        }
        return ws7Var;
    }

    public final /* synthetic */ void K1(String str) {
        str.getClass();
        this.zzb |= 4194304;
        this.zzD = str;
    }

    public final boolean L() {
        if ((this.zzb & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final boolean L0() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void L1() {
        this.zzb |= 8388608;
        this.zzE = false;
    }

    public final int M() {
        return this.zzH;
    }

    public final int M0() {
        return this.zzan;
    }

    public final void M1(ArrayList arrayList) {
        yf7 yf7Var = this.zzF;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzF = yf7Var;
        }
        kf7.b(arrayList, yf7Var);
    }

    public final boolean N() {
        if ((this.zzb & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean N0() {
        if ((this.zze & 16777216) != 0) {
            return true;
        }
        return false;
    }

    public final void N1() {
        this.zzF = vg7.B;
    }

    public final long O() {
        return this.zzL;
    }

    public final qs7 O0() {
        qs7 qs7Var = this.zzao;
        if (qs7Var == null) {
            return qs7.X();
        }
        return qs7Var;
    }

    public final /* synthetic */ void O1(String str) {
        this.zzb |= 16777216;
        this.zzG = str;
    }

    public final boolean P() {
        if ((this.zzb & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public final boolean P0() {
        if ((this.zze & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void P1(int i) {
        this.zzb |= 33554432;
        this.zzH = i;
    }

    public final String Q() {
        return this.zzN;
    }

    public final av7 Q0() {
        av7 av7Var = this.zzaq;
        if (av7Var == null) {
            return av7.t();
        }
        return av7Var;
    }

    public final /* synthetic */ void Q1() {
        this.zzb &= -268435457;
        this.zzK = zzaw.zzK;
    }

    public final boolean R() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int R0() {
        return this.zzf;
    }

    public final List R1() {
        return this.zzg;
    }

    public final boolean S() {
        if ((this.zze & 134217728) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void S0(long j) {
        this.zzb |= 536870912;
        this.zzL = j;
    }

    public final void S1() {
        yf7 yf7Var = this.zzg;
        if (!((re7) yf7Var).x) {
            this.zzg = zo5.o(yf7Var);
        }
    }

    public final long T() {
        return this.zzar;
    }

    public final /* synthetic */ void T0(String str) {
        str.getClass();
        this.zzb |= Integer.MIN_VALUE;
        this.zzN = str;
    }

    public final void T1() {
        yf7 yf7Var = this.zzh;
        if (!((re7) yf7Var).x) {
            this.zzh = zo5.o(yf7Var);
        }
    }

    public final boolean U() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void U0() {
        this.zzb &= Integer.MAX_VALUE;
        this.zzN = zzaw.zzN;
    }

    public final void U1(List list) {
        yf7 yf7Var = this.zzav;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzav = yf7Var;
        }
        kf7.b(list, yf7Var);
    }

    public final gt7 V() {
        gt7 gt7Var = this.zzat;
        if (gt7Var == null) {
            return gt7.t();
        }
        return gt7Var;
    }

    public final /* synthetic */ void V0(int i) {
        this.zze |= 2;
        this.zzP = i;
    }

    public final int V1() {
        return this.zzg.size();
    }

    public final void W0(List list) {
        List list2 = this.zzS;
        boolean z = ((re7) list2).x;
        List list3 = list2;
        if (!z) {
            nf7 nf7Var = (nf7) list2;
            int i = nf7Var.z;
            nf7 l = nf7Var.l(i + i);
            this.zzS = l;
            list3 = l;
        }
        kf7.b(list, list3);
    }

    public final mt7 W1(int i) {
        return (mt7) this.zzg.get(i);
    }

    public final /* synthetic */ void X0(long j) {
        this.zze |= 16;
        this.zzT = j;
    }

    public final yf7 X1() {
        return this.zzh;
    }

    public final /* synthetic */ void Y() {
        this.zzb |= 1;
        this.zzf = 1;
    }

    public final /* synthetic */ void Y0(long j) {
        this.zze |= 32;
        this.zzU = j;
    }

    public final int Y1() {
        return this.zzh.size();
    }

    public final /* synthetic */ void Z(int i, mt7 mt7Var) {
        S1();
        this.zzg.set(i, mt7Var);
    }

    public final /* synthetic */ void Z0(String str) {
        this.zze |= 128;
        this.zzW = str;
    }

    public final cv7 Z1(int i) {
        return (cv7) this.zzh.get(i);
    }

    public final /* synthetic */ void a0(mt7 mt7Var) {
        S1();
        this.zzg.add(mt7Var);
    }

    public final /* synthetic */ void a1(String str) {
        str.getClass();
        this.zze |= 8192;
        this.zzac = str;
    }

    public final boolean a2() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void b0(Iterable iterable) {
        S1();
        kf7.b(iterable, this.zzg);
    }

    public final /* synthetic */ void b1() {
        this.zze &= -8193;
        this.zzac = zzaw.zzac;
    }

    public final long b2() {
        return this.zzi;
    }

    public final void c0() {
        this.zzg = vg7.B;
    }

    public final void c1(Set set) {
        yf7 yf7Var = this.zzad;
        if (!((re7) yf7Var).x) {
            yf7Var = zo5.o(yf7Var);
            this.zzad = yf7Var;
        }
        kf7.b(set, yf7Var);
    }

    public final boolean c2() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void d0(int i) {
        S1();
        this.zzg.remove(i);
    }

    public final /* synthetic */ void d1(String str) {
        str.getClass();
        this.zze |= 16384;
        this.zzae = str;
    }

    public final long d2() {
        return this.zzj;
    }

    public final /* synthetic */ void e0(int i, cv7 cv7Var) {
        T1();
        this.zzh.set(i, cv7Var);
    }

    public final /* synthetic */ void e1(long j) {
        this.zze |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        this.zzaf = j;
    }

    public final boolean e2() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void f0(cv7 cv7Var) {
        T1();
        this.zzh.add(cv7Var);
    }

    public final /* synthetic */ void f1(boolean z) {
        this.zze |= 65536;
        this.zzag = z;
    }

    public final long f2() {
        return this.zzk;
    }

    public final /* synthetic */ void g0(int i) {
        T1();
        this.zzh.remove(i);
    }

    public final /* synthetic */ void g1(String str) {
        this.zze |= 131072;
        this.zzah = str;
    }

    public final boolean g2() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void h0(long j) {
        this.zzb |= 2;
        this.zzi = j;
    }

    public final /* synthetic */ void h1(boolean z) {
        this.zze |= 262144;
        this.zzai = z;
    }

    public final long h2() {
        return this.zzl;
    }

    public final /* synthetic */ void i0() {
        this.zzb &= -3;
        this.zzi = 0L;
    }

    public final /* synthetic */ void i1(String str) {
        str.getClass();
        this.zze |= 524288;
        this.zzaj = str;
    }

    public final boolean i2() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void j0(long j) {
        this.zzb |= 4;
        this.zzj = j;
    }

    public final /* synthetic */ void j1(int i) {
        this.zze |= 1048576;
        this.zzak = i;
    }

    public final long j2() {
        return this.zzm;
    }

    public final /* synthetic */ void k0(long j) {
        this.zzb |= 8;
        this.zzk = j;
    }

    public final /* synthetic */ void k1(ws7 ws7Var) {
        this.zzam = ws7Var;
        this.zze |= 4194304;
    }

    public final String k2() {
        return this.zzn;
    }

    public final /* synthetic */ void l0(long j) {
        this.zzb |= 16;
        this.zzl = j;
    }

    public final /* synthetic */ void l1(int i) {
        this.zze |= 8388608;
        this.zzan = i;
    }

    public final String l2() {
        return this.zzo;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -17;
        this.zzl = 0L;
    }

    public final /* synthetic */ void m1(qs7 qs7Var) {
        this.zzao = qs7Var;
        this.zze |= 16777216;
    }

    public final String m2() {
        return this.zzp;
    }

    public final /* synthetic */ void n0(long j) {
        this.zzb |= 32;
        this.zzm = j;
    }

    public final /* synthetic */ void n1(av7 av7Var) {
        this.zzaq = av7Var;
        this.zze |= 67108864;
    }

    public final String n2() {
        return this.zzq;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -33;
        this.zzm = 0L;
    }

    public final /* synthetic */ void o1(long j) {
        this.zze |= 134217728;
        this.zzar = j;
    }

    public final boolean o2() {
        if ((this.zzb & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void p0() {
        this.zzb |= 64;
        this.zzn = AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID;
    }

    public final /* synthetic */ void p1(gt7 gt7Var) {
        this.zzat = gt7Var;
        this.zze |= 536870912;
    }

    public final int p2() {
        return this.zzr;
    }

    @Override // defpackage.mf7
    public final Object q(int i) {
        sg7 sg7Var;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                sg7 sg7Var2 = zzax;
                                if (sg7Var2 == null) {
                                    synchronized (iu7.class) {
                                        try {
                                            sg7Var = zzax;
                                            if (sg7Var == null) {
                                                sg7Var = new lf7(zzaw);
                                                zzax = sg7Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return sg7Var;
                                }
                                return sg7Var2;
                            }
                            throw null;
                        }
                        return zzaw;
                    }
                    return new kf7(zzaw);
                }
                return new iu7();
            }
            return new wg7(zzaw, "\u0004E\u0000\u0002\u0001YE\u0000\u0006\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=Xဈ>Y\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", mt7.class, "zzh", cv7.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", ys7.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", je7.h, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", yp7.class});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void q0(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzo = str;
    }

    public final /* synthetic */ void q1(String str) {
        str.getClass();
        this.zze |= 1073741824;
        this.zzau = str;
    }

    public final String q2() {
        return this.zzs;
    }

    public final String r() {
        return this.zzt;
    }

    public final boolean r0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void r1() {
        String str = Build.MODEL;
        str.getClass();
        this.zzb |= 256;
        this.zzp = str;
    }

    public final String s() {
        return this.zzu;
    }

    public final int s0() {
        return this.zzP;
    }

    public final /* synthetic */ void s1() {
        this.zzb &= -257;
        this.zzp = zzaw.zzp;
    }

    public final boolean t() {
        if ((this.zzb & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void t1(String str) {
        str.getClass();
        this.zzb |= 512;
        this.zzq = str;
    }

    public final long u() {
        return this.zzv;
    }

    public final long u0() {
        return this.zzT;
    }

    public final /* synthetic */ void u1(int i) {
        this.zzb |= 1024;
        this.zzr = i;
    }

    public final boolean v() {
        if ((this.zzb & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void v1(String str) {
        str.getClass();
        this.zzb |= 2048;
        this.zzs = str;
    }

    public final long w() {
        return this.zzw;
    }

    public final String w0() {
        return this.zzW;
    }

    public final /* synthetic */ void w1(String str) {
        str.getClass();
        this.zzb |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.zzt = str;
    }

    public final String x() {
        return this.zzx;
    }

    public final boolean x0() {
        if ((this.zze & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void x1(String str) {
        str.getClass();
        this.zzb |= 8192;
        this.zzu = str;
    }

    public final boolean y() {
        if ((this.zzb & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final String y0() {
        return this.zzac;
    }

    public final /* synthetic */ void y1(long j) {
        this.zzb |= 16384;
        this.zzv = j;
    }

    public final boolean z() {
        return this.zzy;
    }

    public final boolean z0() {
        if ((this.zze & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void z1() {
        this.zzb |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
        this.zzw = 161000L;
    }
}
