package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.anistation.android.R;
import com.anistation.model.Episode;
import com.anistation.model.Info;
import com.anistation.model.Resource;
import com.anistation.model.connectivity.NetworkState;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.OfflineDownloadMetadata;
import com.anistation.model.watch.SkipRange;
import com.anistation.model.watch.Skips;
import com.anistation.model.watch.SourcesResponse;
import com.anistation.model.watch.WatchSession;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s07 {
    public static final tw5 a = z51.O(1.0f, 340.0f, null, 4);
    public static final tw5 b = z51.O(0.75f, 400.0f, null, 4);
    public static final tw5 c = z51.O(0.5f, 620.0f, null, 4);
    public static final sk6 d;
    public static final sk6 e;
    public static final float f;
    public static final float g;
    public static final float h;

    static {
        z21 z21Var = br1.a;
        d = z51.V(200, 2, z21Var);
        e = z51.V(300, 2, z21Var);
        f = 12.0f;
        g = 300.0f;
        h = 420.0f;
    }

    public static final void a(final long j, final long j2, final yz3 yz3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        kd2Var.f0(2124044931);
        if (kd2Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (kd2Var.e(j2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.f(yz3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            float f2 = 0.0f;
            if (j2 > 0) {
                f2 = db.B(((float) j) / ((float) j2), 0.0f, 1.0f);
            }
            yz3 e2 = ar5.e(ar5.c(yz3Var, 1.0f), 3.0f);
            vo3 c2 = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, e2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            n90 n90Var = n90.a;
            vz3 vz3Var = vz3.x;
            yz3 b2 = n90Var.b(vz3Var);
            long b3 = ep0.b(0.4f, ep0.e);
            ao2 ao2Var = io3.h;
            b90.a(bx7.h(b2, b3, ao2Var), kd2Var, 0);
            b90.a(bx7.h(ar5.c(vz3Var, f2).w(ar5.b), ((mp0) kd2Var.j(op0.a)).a, ao2Var), kd2Var, 0);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(j, j2, yz3Var, i) { // from class: jz6
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ yz3 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    s07.a(this.x, this.y, this.z, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(final WatchSession watchSession, final NetworkState networkState, final boolean z, final float f2, final sb2 sb2Var, final sb2 sb2Var2, final sb2 sb2Var3, final boolean z2, final ub2 ub2Var, final sb2 sb2Var4, final ub2 ub2Var2, yz3 yz3Var, kd2 kd2Var, final int i) {
        final yz3 yz3Var2;
        mj0 mj0Var;
        v11 v11Var;
        String str;
        ei0 ei0Var;
        Context context;
        w44 w44Var;
        w44 w44Var2;
        byte b2;
        w44 w44Var3;
        ub2 ub2Var3;
        ub2 ub2Var4;
        int i2;
        Object obj;
        Boolean bool;
        Boolean bool2;
        w44 w44Var4;
        w44 w44Var5;
        sb2 sb2Var5;
        Configuration configuration;
        Boolean bool3;
        w44 w44Var6;
        v27 v27Var;
        boolean z3;
        boolean z4;
        String str2;
        Object obj2;
        Object obj3;
        w44 w44Var7;
        w44 w44Var8;
        final w44 w44Var9;
        Context context2;
        w44 w44Var10;
        Skips skips;
        Skips skips2;
        OfflineDownloadMetadata metadata;
        final boolean z5;
        final SkipRange skipRange;
        w44 w44Var11;
        final boolean z6;
        final boolean z7;
        Info info;
        kd2 kd2Var2 = kd2Var;
        networkState.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        ub2Var.getClass();
        sb2Var4.getClass();
        ub2Var2.getClass();
        kd2Var2.f0(1678456843);
        int i3 = i | (kd2Var2.h(watchSession) ? 4 : 2) | (kd2Var2.d(networkState.ordinal()) ? 32 : 16) | (kd2Var2.g(z) ? 256 : 128) | (kd2Var2.c(f2) ? 2048 : 1024) | (kd2Var2.h(sb2Var) ? 16384 : 8192) | (kd2Var2.h(sb2Var2) ? 131072 : 65536) | (kd2Var2.h(sb2Var3) ? 1048576 : 524288) | (kd2Var2.g(z2) ? 8388608 : 4194304) | (kd2Var2.h(ub2Var) ? 67108864 : 33554432) | (kd2Var2.h(sb2Var4) ? 536870912 : 268435456);
        if (kd2Var2.V(i3 & 1, (i3 & 306783379) != 306783378)) {
            final String l = zo5.l("watch-", watchSession.getAnimeId());
            boolean f3 = kd2Var2.f(l);
            Object Q = kd2Var2.Q();
            Object obj4 = au0.a;
            if (f3 || Q == obj4) {
                Q = new r07();
                kd2Var2.n0(Q);
            }
            r07 r07Var = (r07) Q;
            boolean h2 = kd2Var2.h(r07Var);
            Object Q2 = kd2Var2.Q();
            byte b3 = 19;
            if (h2 || Q2 == obj4) {
                Q2 = new pp5(r07Var, b3);
                kd2Var2.n0(Q2);
            }
            db.c(r07Var, (ub2) Q2, kd2Var2);
            v27 v27Var2 = (v27) h98.S(z05.a(v27.class), r07Var.x, l, zz.v(r07Var), x83.a(kd2Var2), null);
            ei0 ei0Var2 = v27Var2.l;
            Object Q3 = kd2Var2.Q();
            if (Q3 == obj4) {
                Q3 = new mz6((byte) 0);
                kd2Var2.n0(Q3);
            }
            final w44 w44Var12 = (w44) v94.J(w44.class.getName().hashCode(), (sb2) Q3, kd2Var2, 48);
            Object Q4 = kd2Var2.Q();
            if (Q4 == obj4) {
                Q4 = new jk5((byte) 29);
                kd2Var2.n0(Q4);
            }
            w44 w44Var13 = (w44) v94.J(w44.class.getName().hashCode(), (sb2) Q4, kd2Var2, 48);
            w44 m = h98.m(v27Var2.n, kd2Var2);
            w44 m2 = h98.m(v27Var2.o, kd2Var2);
            mj0 mj0Var2 = v27Var2.q;
            boolean f4 = kd2Var2.f(l);
            Object Q5 = kd2Var2.Q();
            if (f4 || Q5 == obj4) {
                Q5 = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q5);
            }
            w44 w44Var14 = (w44) Q5;
            boolean f5 = kd2Var2.f(l);
            Object Q6 = kd2Var2.Q();
            if (f5 || Q6 == obj4) {
                Q6 = xt5.g(null);
                kd2Var2.n0(Q6);
            }
            w44 w44Var15 = (w44) Q6;
            boolean f6 = kd2Var2.f(l);
            Object Q7 = kd2Var2.Q();
            if (f6 || Q7 == obj4) {
                mj0Var = mj0Var2;
                Q7 = new qi4(0);
                kd2Var2.n0(Q7);
            } else {
                mj0Var = mj0Var2;
            }
            qi4 qi4Var = (qi4) Q7;
            boolean f7 = kd2Var2.f(qi4Var) | kd2Var2.f(w44Var15);
            Object Q8 = kd2Var2.Q();
            if (f7 || Q8 == obj4) {
                Q8 = new ll5((Object) qi4Var, (Object) w44Var15, (byte) 20);
                kd2Var2.n0(Q8);
            }
            final ub2 ub2Var5 = (ub2) Q8;
            hp4 hp4Var = (hp4) w44Var15.getValue();
            boolean f8 = kd2Var2.f(w44Var15);
            Object Q9 = kd2Var2.Q();
            if (f8 || Q9 == obj4) {
                Q9 = new vj6((Object) w44Var15, (vz0) null, (byte) 4);
                kd2Var2.n0(Q9);
            }
            db.f((ic2) Q9, kd2Var2, hp4Var);
            Context context3 = (Context) kd2Var2.j(eb.b);
            Activity activity = (Activity) kd2Var2.j(rj3.a);
            Object Q10 = kd2Var2.Q();
            if (Q10 == obj4) {
                Q10 = db.L(kd2Var2);
                kd2Var2.n0(Q10);
            }
            v11 v11Var2 = (v11) Q10;
            dc5 a2 = x83.a(kd2Var2);
            boolean f9 = kd2Var2.f(null) | kd2Var2.f(a2);
            Object Q11 = kd2Var2.Q();
            if (f9 || Q11 == obj4) {
                v11Var = v11Var2;
                Q11 = a2.d(z05.a(t55.class), null, null);
                kd2Var2.n0(Q11);
            } else {
                v11Var = v11Var2;
            }
            t55 t55Var = (t55) Q11;
            String f10 = lz5.f(R.string.notification_permission_required, kd2Var2);
            String f11 = lz5.f(R.string.cast_local_network_permission_required, kd2Var2);
            String f12 = lz5.f(R.string.rewarded_ad_skipped, kd2Var2);
            String f13 = lz5.f(R.string.rewarded_ad_unavailable, kd2Var2);
            String f14 = lz5.f(R.string.rewarded_ad_already_showing, kd2Var2);
            String f15 = lz5.f(R.string.rewarded_ads_not_configured, kd2Var2);
            boolean f16 = kd2Var2.f(l);
            Object Q12 = kd2Var2.Q();
            if (f16 || Q12 == obj4) {
                Q12 = xt5.g(null);
                kd2Var2.n0(Q12);
            }
            w44 w44Var16 = (w44) Q12;
            boolean f17 = kd2Var2.f(l);
            Object Q13 = kd2Var2.Q();
            if (f17 || Q13 == obj4) {
                Q13 = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q13);
            }
            w44 w44Var17 = (w44) Q13;
            boolean h3 = kd2Var2.h(v27Var2);
            Object Q14 = kd2Var2.Q();
            if (h3 || Q14 == obj4) {
                str = f11;
                Q14 = new pp5((Object) v27Var2, (byte) 18);
                kd2Var2.n0(Q14);
            } else {
                str = f11;
            }
            ub2 ub2Var6 = (ub2) Q14;
            boolean f18 = kd2Var2.f(ub2Var6) | kd2Var2.h(activity) | kd2Var2.f(f13) | kd2Var2.h(t55Var) | kd2Var2.h(ei0Var2) | kd2Var2.f(w44Var17) | kd2Var2.f(f12) | kd2Var2.f(f14) | kd2Var2.f(f15);
            Object Q15 = kd2Var2.Q();
            if (f18 || Q15 == obj4) {
                Q15 = new f05(ub2Var6, activity, f13, t55Var, ei0Var2, f12, f14, f15, w44Var17, (byte) 1);
                ei0Var = ei0Var2;
                kd2Var2.n0(Q15);
            } else {
                ei0Var = ei0Var2;
            }
            ub2 ub2Var7 = (ub2) Q15;
            y4 y4Var = new y4((byte) 2);
            boolean f19 = kd2Var2.f(w44Var16) | kd2Var2.f(ub2Var7) | kd2Var2.f(f10);
            Object Q16 = kd2Var2.Q();
            byte b4 = 3;
            if (f19 || Q16 == obj4) {
                Q16 = new qb6(ub2Var7, f10, w44Var16, b4);
                kd2Var2.n0(Q16);
            }
            sm3 J = kb0.J(y4Var, (ub2) Q16, kd2Var2);
            y4 y4Var2 = new y4((byte) 2);
            String str3 = str;
            boolean f20 = kd2Var2.f(w44Var13) | kd2Var2.f(str3);
            Object Q17 = kd2Var2.Q();
            if (f20 || Q17 == obj4) {
                Q17 = new ll5((Object) str3, (Object) w44Var13, (byte) 21);
                kd2Var2.n0(Q17);
            }
            sm3 J2 = kb0.J(y4Var2, (ub2) Q17, kd2Var2);
            boolean h4 = kd2Var2.h(context3) | kd2Var2.h(J2) | kd2Var2.f(w44Var13);
            Object Q18 = kd2Var2.Q();
            if (h4 || Q18 == obj4) {
                Q18 = new mi((Object) context3, (Object) J2, (Object) w44Var13, (byte) 19);
                kd2Var2.n0(Q18);
            }
            sb2 sb2Var6 = (sb2) Q18;
            boolean f21 = kd2Var2.f(m) | kd2Var2.f(w44Var17) | kd2Var2.h(context3) | kd2Var2.f(w44Var16) | kd2Var2.h(J) | kd2Var2.f(ub2Var7);
            Object Q19 = kd2Var2.Q();
            if (f21 || Q19 == obj4) {
                Q19 = new is6(context3, J, ub2Var7, m, w44Var17, w44Var16);
                context = context3;
                w44Var = m;
                w44Var2 = w44Var17;
                kd2Var2.n0(Q19);
            } else {
                w44Var = m;
                w44Var2 = w44Var17;
                context = context3;
            }
            ic2 ic2Var = (ic2) Q19;
            boolean f22 = kd2Var2.f(ic2Var);
            Object Q20 = kd2Var2.Q();
            if (f22 || Q20 == obj4) {
                Q20 = new n36(ic2Var, (byte) 1);
                kd2Var2.n0(Q20);
            }
            ub2 ub2Var8 = (ub2) Q20;
            boolean f23 = kd2Var2.f(ic2Var);
            Object Q21 = kd2Var2.Q();
            if (f23 || Q21 == obj4) {
                b2 = 2;
                Q21 = new n36(ic2Var, b2);
                kd2Var2.n0(Q21);
            } else {
                b2 = 2;
            }
            ub2 ub2Var9 = (ub2) Q21;
            Configuration configuration2 = (Configuration) kd2Var2.j(eb.a);
            boolean z8 = configuration2.orientation == b2;
            boolean z9 = configuration2.smallestScreenWidthDp >= 600;
            final boolean booleanValue = ((Boolean) kd2Var2.j(ie6.f)).booleanValue();
            final boolean booleanValue2 = ((Boolean) kd2Var2.j(ie6.g)).booleanValue();
            final float f24 = z9 ? 35.0f : 30.0f;
            boolean z10 = z9 ? ((dq4) m2.getValue()).c : z8;
            Boolean valueOf = Boolean.valueOf(z10);
            Boolean valueOf2 = Boolean.valueOf(z);
            Boolean valueOf3 = Boolean.valueOf(((dq4) m2.getValue()).j);
            final ei0 ei0Var3 = ei0Var;
            int i4 = i3 & 896;
            boolean f25 = kd2Var2.f(w44Var14) | kd2Var2.g(z10) | (i4 == 256) | kd2Var2.f(m2) | kd2Var2.f(w44Var15);
            Object Q22 = kd2Var2.Q();
            if (f25 || Q22 == obj4) {
                w44Var3 = w44Var13;
                ub2Var3 = ub2Var9;
                ub2Var4 = ub2Var8;
                i2 = i3;
                obj = obj4;
                bool = valueOf2;
                bool2 = valueOf3;
                w44Var4 = m2;
                w44Var5 = w44Var15;
                sb2Var5 = sb2Var6;
                configuration = configuration2;
                bool3 = valueOf;
                w44Var6 = w44Var14;
                v27Var = v27Var2;
                z3 = z10;
                z4 = z;
                Q22 = new nj(z3, z4, w44Var6, w44Var4, w44Var5, (vz0) null);
                kd2Var2.n0(Q22);
            } else {
                w44Var3 = w44Var13;
                ub2Var3 = ub2Var9;
                ub2Var4 = ub2Var8;
                i2 = i3;
                bool = valueOf2;
                bool2 = valueOf3;
                obj = obj4;
                w44Var4 = m2;
                w44Var5 = w44Var15;
                sb2Var5 = sb2Var6;
                configuration = configuration2;
                bool3 = valueOf;
                w44Var6 = w44Var14;
                v27Var = v27Var2;
                z3 = z10;
                z4 = z;
            }
            db.h(bool3, bool, bool2, (ic2) Q22, kd2Var2);
            String f26 = lz5.f(R.string.intro_skipped, kd2Var2);
            String f27 = lz5.f(R.string.outro_skipped, kd2Var2);
            Episode episode = ((ym6) w44Var.getValue()).b;
            String image = episode != null ? episode.getImage() : null;
            Resource resource = ((ym6) w44Var.getValue()).u;
            Resource.Success success = resource instanceof Resource.Success ? (Resource.Success) resource : null;
            String b5 = e02.b((success == null || (info = (Info) success.getData()) == null) ? null : info.getTitle());
            Episode episode2 = ((ym6) w44Var.getValue()).b;
            if (episode2 == null || (str2 = episode2.getTitle()) == null) {
                str2 = b5;
            }
            final boolean z11 = z3;
            Object[] objArr = new Object[0];
            final w44 w44Var18 = w44Var6;
            final w44 w44Var19 = w44Var4;
            final w44 w44Var20 = w44Var5;
            y23 y23Var = new y23(new vs0((byte) 3), new b3((byte) 7), (byte) 14);
            boolean z12 = i4 == 256;
            Object Q23 = kd2Var2.Q();
            if (z12 || Q23 == obj) {
                Q23 = new pp2((byte) 1, z4);
                kd2Var2.n0(Q23);
            }
            final e9 e9Var = (e9) oi4.D(objArr, y23Var, (sb2) Q23, kd2Var2, 0);
            boolean f28 = kd2Var2.f(l);
            Object Q24 = kd2Var2.Q();
            if (f28 || Q24 == obj) {
                obj2 = obj;
                obj3 = null;
                Q24 = new wj(new xc4(0L), db.q, null, 12);
                kd2Var2.n0(Q24);
            } else {
                obj2 = obj;
                obj3 = null;
            }
            final wj wjVar = (wj) Q24;
            Object Q25 = kd2Var2.Q();
            if (Q25 == obj2) {
                Q25 = xt5.g(obj3);
                kd2Var2.n0(Q25);
            }
            final w44 w44Var21 = (w44) Q25;
            boolean f29 = kd2Var2.f(l);
            Object Q26 = kd2Var2.Q();
            if (f29 || Q26 == obj2) {
                Q26 = xt5.g(uy3.A);
                kd2Var2.n0(Q26);
            }
            final w44 w44Var22 = (w44) Q26;
            boolean f30 = kd2Var2.f(l);
            Object Q27 = kd2Var2.Q();
            if (f30 || Q27 == obj2) {
                Q27 = v94.a(1.0f);
                kd2Var2.n0(Q27);
            }
            final wj wjVar2 = (wj) Q27;
            boolean f31 = kd2Var2.f(l);
            Object Q28 = kd2Var2.Q();
            if (f31 || Q28 == obj2) {
                Q28 = new pi4(0.0f);
                kd2Var2.n0(Q28);
            }
            final pi4 pi4Var = (pi4) Q28;
            Object Q29 = kd2Var2.Q();
            if (Q29 == obj2) {
                Q29 = xt5.g(null);
                kd2Var2.n0(Q29);
            }
            final w44 w44Var23 = (w44) Q29;
            boolean f32 = kd2Var2.f(l);
            Object Q30 = kd2Var2.Q();
            if (f32 || Q30 == obj2) {
                Q30 = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q30);
            }
            w44 w44Var24 = (w44) Q30;
            Object Q31 = kd2Var2.Q();
            if (Q31 == obj2) {
                Q31 = xt5.g(Boolean.FALSE);
                kd2Var2.n0(Q31);
            }
            w44 w44Var25 = (w44) Q31;
            Object Q32 = kd2Var2.Q();
            if (Q32 == obj2) {
                Q32 = xt5.g(Boolean.valueOf(z));
                kd2Var2.n0(Q32);
            }
            w44 w44Var26 = (w44) Q32;
            boolean f33 = kd2Var2.f(w44Var24) | kd2Var2.h(v11Var) | kd2Var2.h(wjVar2) | kd2Var2.h(v27Var) | ((i2 & 3670016) == 1048576);
            Object Q33 = kd2Var2.Q();
            if (f33 || Q33 == obj2) {
                v11 v11Var3 = v11Var;
                Q33 = new d25(v11Var3, w44Var24, w44Var21, wjVar2, v27Var, sb2Var3, (byte) 1);
                w44Var7 = w44Var24;
                v11Var = v11Var3;
                kd2Var2.n0(Q33);
            } else {
                w44Var7 = w44Var24;
            }
            final sb2 sb2Var7 = (sb2) Q33;
            w44 h5 = xt5.h(Boolean.valueOf(z), kd2Var2);
            final String str4 = image;
            w44 h6 = xt5.h(sb2Var, kd2Var2);
            final String str5 = str2;
            w44 h7 = xt5.h(sb2Var2, kd2Var2);
            final w44 h8 = xt5.h(ub2Var2, kd2Var2);
            w44 h9 = xt5.h(v27Var, kd2Var2);
            w44 h10 = xt5.h((dq4) w44Var19.getValue(), kd2Var2);
            Context context4 = context;
            boolean f34 = kd2Var2.f(w44Var7) | ((i2 & 57344) == 16384);
            Object Q34 = kd2Var2.Q();
            if (f34 || Q34 == obj2) {
                Q34 = new b01(sb2Var, w44Var7, w44Var25, (byte) 2);
                kd2Var2.n0(Q34);
            }
            final sb2 sb2Var8 = (sb2) Q34;
            boolean f35 = kd2Var2.f(w44Var7) | ((i2 & 458752) == 131072);
            Object Q35 = kd2Var2.Q();
            if (f35 || Q35 == obj2) {
                Q35 = new b01(sb2Var2, w44Var7, w44Var25, (byte) 3);
                kd2Var2.n0(Q35);
            }
            final sb2 sb2Var9 = (sb2) Q35;
            boolean f36 = kd2Var2.f(e9Var) | kd2Var2.f(h5) | kd2Var2.f(w44Var7) | kd2Var2.f(h10) | kd2Var2.f(h9) | kd2Var2.f(h6) | kd2Var2.f(h7);
            Object Q36 = kd2Var2.Q();
            if (f36 || Q36 == obj2) {
                w44Var8 = w44Var25;
                Q36 = new uz6(e9Var, w44Var8, w44Var26, h5, w44Var7, h10, h9, h6, h7, null);
                w44Var9 = w44Var26;
                kd2Var2.n0(Q36);
            } else {
                w44Var8 = w44Var25;
                w44Var9 = w44Var26;
            }
            db.f((ic2) Q36, kd2Var2, e9Var);
            Boolean valueOf4 = Boolean.valueOf(z2);
            boolean h11 = ((i2 & 29360128) == 8388608) | kd2Var2.h(v27Var);
            Object Q37 = kd2Var2.Q();
            if (h11 || Q37 == obj2) {
                Q37 = new vz6(z2, v27Var, (vz0) null);
                kd2Var2.n0(Q37);
            }
            db.f((ic2) Q37, kd2Var2, valueOf4);
            mj0 mj0Var3 = mj0Var;
            boolean h12 = kd2Var2.h(mj0Var3);
            Object Q38 = kd2Var2.Q();
            if (h12 || Q38 == obj2) {
                Q38 = new c52(mj0Var3, null, (byte) 1);
                kd2Var2.n0(Q38);
            }
            db.f((ic2) Q38, kd2Var2, mj0Var3);
            Boolean valueOf5 = Boolean.valueOf(((ym6) w44Var.getValue()).E);
            Boolean valueOf6 = Boolean.valueOf(((ym6) w44Var.getValue()).F);
            boolean f37 = kd2Var2.f(w44Var) | kd2Var2.h(context4) | kd2Var2.f(f26) | kd2Var2.f(f27);
            Object Q39 = kd2Var2.Q();
            if (f37 || Q39 == obj2) {
                w44 w44Var27 = w44Var;
                context2 = context4;
                Q39 = new z01(context2, f26, f27, w44Var27, null, (byte) 2);
                w44Var10 = w44Var27;
                kd2Var2.n0(Q39);
            } else {
                w44Var10 = w44Var;
                context2 = context4;
            }
            db.g(valueOf5, valueOf6, (ic2) Q39, kd2Var2);
            Object[] objArr2 = {Boolean.valueOf(((ym6) w44Var10.getValue()).D), ((ym6) w44Var10.getValue()).u, ((ym6) w44Var10.getValue()).C, ((ym6) w44Var10.getValue()).c};
            boolean f38 = kd2Var2.f(w44Var10) | kd2Var2.h(v27Var);
            Object Q40 = kd2Var2.Q();
            if (f38 || Q40 == obj2) {
                skips = null;
                Q40 = new xz6(v27Var, w44Var10, null);
                kd2Var2.n0(Q40);
            } else {
                skips = null;
            }
            db.i(objArr2, (ic2) Q40, kd2Var2);
            double d2 = ((dq4) w44Var19.getValue()).d / 1000.0d;
            SourcesResponse sourcesResponse = ((ym6) w44Var10.getValue()).d;
            if (sourcesResponse == null || (skips2 = sourcesResponse.getSkips()) == null) {
                EpisodeDownload d3 = ((ym6) w44Var10.getValue()).d();
                skips2 = (d3 == null || (metadata = d3.getMetadata()) == null) ? skips : metadata.getSkips();
            }
            if (skips2 != null) {
                z5 = z9;
                skipRange = skips2.getIntro();
            } else {
                z5 = z9;
                skipRange = skips;
            }
            SkipRange outro = skips2 != null ? skips2.getOutro() : skips;
            final boolean z13 = skipRange != null && d2 >= skipRange.getStart() && d2 < skipRange.getEnd();
            if (outro == null || d2 < outro.getStart() || d2 >= outro.getEnd()) {
                w44Var11 = w44Var10;
                z6 = z8;
                z7 = false;
            } else {
                w44Var11 = w44Var10;
                z6 = z8;
                z7 = true;
            }
            Object obj5 = obj2;
            final v27 v27Var3 = v27Var;
            final Context context5 = context2;
            final w44 w44Var28 = w44Var11;
            final w44 w44Var29 = w44Var2;
            final sb2 sb2Var10 = sb2Var5;
            final w44 w44Var30 = w44Var7;
            final SkipRange skipRange2 = outro;
            final v11 v11Var4 = v11Var;
            final Configuration configuration3 = configuration;
            final ub2 ub2Var10 = ub2Var3;
            final ub2 ub2Var11 = ub2Var4;
            final w44 w44Var31 = w44Var8;
            kd2Var2 = kd2Var;
            x97.b(hz5.k(ar5.c, z11 ? 100.0f : 50.0f), null, nx7.R(1115513953, new jc2() { // from class: sz6
                @Override // defpackage.jc2
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    int intValue = ((Integer) obj8).intValue();
                    s07.h(f2, configuration3, z5, z6, z11, booleanValue2, z, e9Var, l, w44Var22, wjVar, h8, v27Var3, pi4Var, w44Var18, w44Var19, w44Var30, booleanValue, v11Var4, wjVar2, sb2Var3, w44Var31, w44Var21, w44Var9, w44Var28, w44Var23, watchSession, networkState, w44Var12, ub2Var11, ub2Var10, sb2Var8, ub2Var, context5, w44Var29, ei0Var3, str4, sb2Var10, sb2Var9, str5, z13, z7, skipRange, skipRange2, ub2Var5, w44Var20, f24, sb2Var7, (p90) obj6, (kd2) obj7, intValue);
                    return pn6.a;
                }
            }, kd2Var2), kd2Var2, 3072, 6);
            boolean z14 = ((Boolean) w44Var3.getValue()).booleanValue() && !((dq4) w44Var19.getValue()).j;
            w44 w44Var32 = w44Var3;
            boolean f39 = kd2Var2.f(w44Var32);
            Object Q41 = kd2Var2.Q();
            if (f39 || Q41 == obj5) {
                Q41 = new gz6(w44Var32, (byte) 2);
                kd2Var2.n0(Q41);
            }
            n77.c(z14, (sb2) Q41, z11, null, kd2Var2, 0);
            boolean z15 = ((Boolean) w44Var32.getValue()).booleanValue() && ((dq4) w44Var19.getValue()).j;
            boolean f40 = kd2Var2.f(w44Var32);
            Object Q42 = kd2Var2.Q();
            if (f40 || Q42 == obj5) {
                Q42 = new gz6(w44Var32, (byte) 0);
                kd2Var2.n0(Q42);
            }
            sb2 sb2Var11 = (sb2) Q42;
            String str6 = ((dq4) w44Var19.getValue()).k;
            boolean h13 = kd2Var2.h(v27Var3);
            Object Q43 = kd2Var2.Q();
            if (h13 || Q43 == obj5) {
                Q43 = new ia(0, v27Var3, v27.class, "disconnectCast", "disconnectCast()V", 0, (byte) 25);
                kd2Var2.n0(Q43);
            }
            n77.a(z15, sb2Var11, z11, ei0Var3, str6, str4, str5, b5, (sb2) ((i73) Q43), null, kd2Var2, 0);
            boolean f41 = kd2Var2.f(w44Var18) | kd2Var2.f(ub2Var5) | kd2Var2.f(w44Var19) | kd2Var2.h(v27Var3) | kd2Var2.f(e9Var) | kd2Var2.f(sb2Var8) | ((i2 & 1879048192) == 536870912);
            Object Q44 = kd2Var2.Q();
            if (f41 || Q44 == obj5) {
                final w44 w44Var33 = w44Var8;
                Q44 = new sb2() { // from class: hz6
                    @Override // defpackage.sb2
                    public final Object invoke() {
                        if (s07.o(w44Var18)) {
                            ub2.this.invoke(gp4.y);
                        } else if (((dq4) w44Var19.getValue()).c) {
                            v27Var3.P(false);
                        } else if (!s07.e(w44Var33)) {
                            if (e9Var.e.getValue() == xx6.y) {
                                sb2Var8.invoke();
                            } else {
                                sb2Var4.invoke();
                            }
                        }
                        return pn6.a;
                    }
                };
                kd2Var2.n0(Q44);
            }
            z51.a(false, (sb2) Q44, kd2Var2, 0, 1);
            yz3Var2 = vz3.x;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2(networkState, z, f2, sb2Var, sb2Var2, sb2Var3, z2, ub2Var, sb2Var4, ub2Var2, yz3Var2, i) { // from class: iz6
                public final /* synthetic */ float A;
                public final /* synthetic */ sb2 B;
                public final /* synthetic */ sb2 C;
                public final /* synthetic */ sb2 D;
                public final /* synthetic */ boolean E;
                public final /* synthetic */ ub2 F;
                public final /* synthetic */ sb2 G;
                public final /* synthetic */ ub2 H;
                public final /* synthetic */ yz3 I;
                public final /* synthetic */ NetworkState y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int N = kb0.N(1);
                    s07.b(WatchSession.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (kd2) obj6, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final n17 c(w44 w44Var) {
        return (n17) w44Var.getValue();
    }

    public static final boolean d(w44 w44Var) {
        return ((Boolean) w44Var.getValue()).booleanValue();
    }

    public static final boolean e(w44 w44Var) {
        return ((Boolean) w44Var.getValue()).booleanValue();
    }

    public static final ym6 f(w44 w44Var) {
        return (ym6) w44Var.getValue();
    }

    public static final dq4 g(w44 w44Var) {
        return (dq4) w44Var.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x071d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0786 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0895 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x08f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x092b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x09a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x09b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x09d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x09f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0a12 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a2e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a4e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0a66 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0a8c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0aa8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0ac0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0ada A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0afc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0b16 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0b3c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b54 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0c03 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0cd7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0e23 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0e5e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0ea1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f01 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0f1f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0f35  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0f65 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0f8e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0fa8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0fbe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0fde A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0ff8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x1012 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x102c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x106f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x10a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x10f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x1137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x116a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x1194 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x120f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x1285  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1049  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0ea9  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0630  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(float r109, android.content.res.Configuration r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, defpackage.e9 r116, java.lang.String r117, defpackage.w44 r118, final defpackage.wj r119, defpackage.w44 r120, final defpackage.v27 r121, defpackage.pi4 r122, defpackage.w44 r123, final defpackage.w44 r124, defpackage.w44 r125, boolean r126, defpackage.v11 r127, defpackage.wj r128, defpackage.sb2 r129, defpackage.w44 r130, defpackage.w44 r131, defpackage.w44 r132, defpackage.w44 r133, defpackage.w44 r134, com.anistation.model.watch.WatchSession r135, com.anistation.model.connectivity.NetworkState r136, defpackage.w44 r137, defpackage.ub2 r138, defpackage.ub2 r139, defpackage.sb2 r140, defpackage.ub2 r141, android.content.Context r142, defpackage.w44 r143, defpackage.ei0 r144, java.lang.String r145, final defpackage.sb2 r146, defpackage.sb2 r147, java.lang.String r148, boolean r149, boolean r150, com.anistation.model.watch.SkipRange r151, com.anistation.model.watch.SkipRange r152, defpackage.ub2 r153, defpackage.w44 r154, final float r155, final defpackage.sb2 r156, defpackage.p90 r157, defpackage.kd2 r158, int r159) {
        /*
            Method dump skipped, instructions count: 4805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s07.h(float, android.content.res.Configuration, boolean, boolean, boolean, boolean, boolean, e9, java.lang.String, w44, wj, w44, v27, pi4, w44, w44, w44, boolean, v11, wj, sb2, w44, w44, w44, w44, w44, com.anistation.model.watch.WatchSession, com.anistation.model.connectivity.NetworkState, w44, ub2, ub2, sb2, ub2, android.content.Context, w44, ei0, java.lang.String, sb2, sb2, java.lang.String, boolean, boolean, com.anistation.model.watch.SkipRange, com.anistation.model.watch.SkipRange, ub2, w44, float, sb2, p90, kd2, int):void");
    }

    public static final boolean i(px5 px5Var) {
        return ((Boolean) px5Var.getValue()).booleanValue();
    }

    public static final boolean j(px5 px5Var) {
        return ((Boolean) px5Var.getValue()).booleanValue();
    }

    public static final boolean k(px5 px5Var) {
        return ((Boolean) px5Var.getValue()).booleanValue();
    }

    public static final boolean l(px5 px5Var) {
        return ((Boolean) px5Var.getValue()).booleanValue();
    }

    public static final float m(px5 px5Var) {
        return ((Number) px5Var.getValue()).floatValue();
    }

    public static final float n(pi4 pi4Var) {
        return pi4Var.h();
    }

    public static final boolean o(w44 w44Var) {
        return ((Boolean) w44Var.getValue()).booleanValue();
    }

    public static final float p(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static final yz3 q(yz3 yz3Var, e9 e9Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        q07 q07Var = new q07(z, e9Var);
        nq4 nq4Var = v36.a;
        return yz3Var.w(new u36(e9Var, valueOf, null, q07Var, 4));
    }

    public static final long r(uy3 uy3Var, float f2, float f3, float f4, float f5) {
        int ordinal = uy3Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
                    }
                    ze0.l();
                    return 0L;
                }
                return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L);
            }
            return (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
    }
}
