package defpackage;

import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class op0 {
    public static final tq1 a = new tq1(new gr((byte) 12), (byte) 1);
    public static final tq1 b = new tq1(new gr((byte) 13), (byte) 1);

    public static final long a(long j, kd2 kd2Var) {
        kd2Var.e0(89374938);
        mp0 mp0Var = (mp0) kd2Var.j(a);
        long j2 = mp0Var.a;
        long j3 = mp0Var.U;
        long j4 = mp0Var.Q;
        long j5 = mp0Var.M;
        long j6 = mp0Var.q;
        int i = ep0.j;
        if (cm6.a(j, j2)) {
            j3 = mp0Var.b;
        } else if (cm6.a(j, mp0Var.f)) {
            j3 = mp0Var.g;
        } else if (cm6.a(j, mp0Var.j)) {
            j3 = mp0Var.k;
        } else if (cm6.a(j, mp0Var.n)) {
            j3 = mp0Var.o;
        } else if (cm6.a(j, mp0Var.w)) {
            j3 = mp0Var.x;
        } else if (cm6.a(j, mp0Var.c)) {
            j3 = mp0Var.d;
        } else if (cm6.a(j, mp0Var.h)) {
            j3 = mp0Var.i;
        } else if (cm6.a(j, mp0Var.l)) {
            j3 = mp0Var.m;
        } else if (cm6.a(j, mp0Var.y)) {
            j3 = mp0Var.z;
        } else if (cm6.a(j, mp0Var.u)) {
            j3 = mp0Var.v;
        } else {
            if (!cm6.a(j, mp0Var.p)) {
                if (cm6.a(j, mp0Var.r)) {
                    j3 = mp0Var.s;
                } else if (!cm6.a(j, mp0Var.D) && !cm6.a(j, mp0Var.F) && !cm6.a(j, mp0Var.G) && !cm6.a(j, mp0Var.H) && !cm6.a(j, mp0Var.I) && !cm6.a(j, mp0Var.J) && !cm6.a(j, mp0Var.E)) {
                    if (cm6.a(j, mp0Var.K) || cm6.a(j, mp0Var.L)) {
                        j3 = j5;
                    } else if (cm6.a(j, mp0Var.O) || cm6.a(j, mp0Var.P)) {
                        j3 = j4;
                    } else if (!cm6.a(j, mp0Var.S) && !cm6.a(j, mp0Var.T)) {
                        j3 = ep0.i;
                    }
                }
            }
            j3 = j6;
        }
        if (j3 == 16) {
            j3 = ((ep0) kd2Var.j(ey0.a)).a;
        }
        kd2Var.q(false);
        return j3;
    }

    public static mp0 b(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        return new mp0(j, (i & 2) != 0 ? fp0.h : j2, (i & 4) != 0 ? fp0.x : j3, (i & 8) != 0 ? fp0.i : j4, (i & 16) != 0 ? fp0.d : j5, j6, (i & 64) != 0 ? fp0.l : j7, (i & 128) != 0 ? fp0.B : j8, (i & 256) != 0 ? fp0.m : j9, (i & 512) != 0 ? fp0.L : j10, (i & 1024) != 0 ? fp0.r : j11, (i & 2048) != 0 ? fp0.M : j12, (i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? fp0.s : j13, j14, j15, j16, (65536 & i) != 0 ? fp0.p : j17, j18, (262144 & i) != 0 ? fp0.q : j19, (524288 & i) != 0 ? j : j20, (1048576 & i) != 0 ? fp0.e : j21, (2097152 & i) != 0 ? fp0.c : j22, fp0.a, fp0.f, fp0.b, fp0.g, (67108864 & i) != 0 ? fp0.v : j23, (134217728 & i) != 0 ? fp0.w : j24, (268435456 & i) != 0 ? fp0.A : j25, (536870912 & i) != 0 ? fp0.E : j26, (i2 & 8) != 0 ? fp0.K : j32, (1073741824 & i) != 0 ? fp0.F : j27, (i & Integer.MIN_VALUE) != 0 ? fp0.G : j28, (i2 & 1) != 0 ? fp0.H : j29, (i2 & 2) != 0 ? fp0.I : j30, (i2 & 4) != 0 ? fp0.J : j31, (i2 & 16) != 0 ? fp0.y : j33, (i2 & 32) != 0 ? fp0.z : j34, (i2 & 64) != 0 ? fp0.j : j35, (i2 & 128) != 0 ? fp0.k : j36, (i2 & 256) != 0 ? fp0.C : j37, (i2 & 512) != 0 ? fp0.D : j38, (i2 & 1024) != 0 ? fp0.n : j39, (i2 & 2048) != 0 ? fp0.o : j40, (i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? fp0.N : j41, (i2 & 8192) != 0 ? fp0.O : j42, (i2 & 16384) != 0 ? fp0.t : j43, (32768 & i2) != 0 ? fp0.u : j44);
    }

    public static final long c(mp0 mp0Var, np0 np0Var) {
        switch (np0Var.ordinal()) {
            case 0:
                return mp0Var.n;
            case 1:
                return mp0Var.w;
            case 2:
                return mp0Var.y;
            case 3:
                return mp0Var.v;
            case 4:
                return mp0Var.e;
            case 5:
                return mp0Var.u;
            case 6:
                return mp0Var.o;
            case 7:
                return mp0Var.x;
            case 8:
                return mp0Var.z;
            case 9:
                return mp0Var.b;
            case 10:
                return mp0Var.d;
            case 11:
                return mp0Var.M;
            case 12:
                return mp0Var.N;
            case 13:
                return mp0Var.g;
            case 14:
                return mp0Var.i;
            case 15:
                return mp0Var.Q;
            case 16:
                return mp0Var.R;
            case 17:
                return mp0Var.q;
            case 18:
                return mp0Var.s;
            case 19:
                return mp0Var.k;
            case 20:
                return mp0Var.m;
            case 21:
                return mp0Var.U;
            case 22:
                return mp0Var.V;
            case 23:
                return mp0Var.A;
            case 24:
                return mp0Var.B;
            case 25:
                return mp0Var.a;
            case 26:
                return mp0Var.c;
            case 27:
                return mp0Var.K;
            case 28:
                return mp0Var.L;
            case 29:
                return mp0Var.C;
            case 30:
                return mp0Var.f;
            case 31:
                return mp0Var.h;
            case 32:
                return mp0Var.O;
            case 33:
                return mp0Var.P;
            case 34:
                return mp0Var.p;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                return mp0Var.D;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                return mp0Var.F;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                return mp0Var.G;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                return mp0Var.H;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                return mp0Var.I;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                return mp0Var.J;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                return mp0Var.E;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                return mp0Var.t;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                return mp0Var.r;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                return mp0Var.j;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                return mp0Var.l;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                return mp0Var.S;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                return mp0Var.T;
            default:
                ze0.l();
                return 0L;
        }
    }

    public static final long d(np0 np0Var, kd2 kd2Var) {
        return c((mp0) kd2Var.j(a), np0Var);
    }

    public static mp0 e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, int i, int i2) {
        long j45 = (i & 1) != 0 ? jp0.z : j;
        return new mp0(j45, (i & 2) != 0 ? jp0.j : j2, (i & 4) != 0 ? jp0.A : j3, (i & 8) != 0 ? jp0.k : j4, (i & 16) != 0 ? jp0.e : j5, (i & 32) != 0 ? jp0.E : j6, (i & 64) != 0 ? jp0.n : j7, (i & 128) != 0 ? jp0.F : j8, (i & 256) != 0 ? jp0.o : j9, (i & 512) != 0 ? jp0.R : j10, (i & 1024) != 0 ? jp0.t : j11, (i & 2048) != 0 ? jp0.S : j12, (i & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? jp0.u : j13, (i & 8192) != 0 ? jp0.a : j14, (i & 16384) != 0 ? jp0.g : j15, (i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? jp0.I : j16, (65536 & i) != 0 ? jp0.r : j17, (131072 & i) != 0 ? jp0.Q : j18, (262144 & i) != 0 ? jp0.s : j19, (524288 & i) != 0 ? j45 : j20, (1048576 & i) != 0 ? jp0.f : j21, (2097152 & i) != 0 ? jp0.d : j22, jp0.b, jp0.h, jp0.c, jp0.i, (67108864 & i) != 0 ? jp0.x : j23, (134217728 & i) != 0 ? jp0.y : j24, (268435456 & i) != 0 ? jp0.D : j25, (536870912 & i) != 0 ? jp0.J : j26, (i2 & 8) != 0 ? jp0.P : j32, (1073741824 & i) != 0 ? jp0.K : j27, (i & Integer.MIN_VALUE) != 0 ? jp0.L : j28, (i2 & 1) != 0 ? jp0.M : j29, (i2 & 2) != 0 ? jp0.N : j30, (i2 & 4) != 0 ? jp0.O : j31, (i2 & 16) != 0 ? jp0.B : j33, (i2 & 32) != 0 ? jp0.C : j34, (i2 & 64) != 0 ? jp0.l : j35, (i2 & 128) != 0 ? jp0.m : j36, (i2 & 256) != 0 ? jp0.G : j37, (i2 & 512) != 0 ? jp0.H : j38, (i2 & 1024) != 0 ? jp0.p : j39, (i2 & 2048) != 0 ? jp0.q : j40, (i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0 ? jp0.T : j41, (i2 & 8192) != 0 ? jp0.U : j42, (i2 & 16384) != 0 ? jp0.v : j43, (i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? jp0.w : j44);
    }
}
