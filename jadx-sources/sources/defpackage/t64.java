package defpackage;

import com.anistation.android.presence.DiscordPresenceNativeBridge;
import com.anistation.model.Episode;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t64 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t64(u64 u64Var, long j, yg1 yg1Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = u64Var;
        this.y = j;
        this.A = yg1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                return new t64((u64) obj3, this.y, (yg1) obj2, vz0Var);
            default:
                return new t64((v27) obj3, (t17) obj2, this.y, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((t64) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((t64) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.x;
        long j = this.y;
        Object obj2 = this.z;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.A;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                m37.N(obj);
                u64 u64Var = (u64) obj2;
                if (u64Var.b.get() == j) {
                    if (!u64Var.d) {
                        boolean c = DiscordPresenceNativeBridge.a.c();
                        u64Var.d = c;
                        if (c) {
                            bx5 bx5Var = u64Var.c;
                            if (bx5Var == null || !bx5Var.isActive()) {
                                u64Var.c = tl7.z(u64Var.a, null, null, new b20(2, vz0Var, (byte) 12), 3);
                            }
                        }
                    }
                    DiscordPresenceNativeBridge.a.e((yg1) obj3);
                }
                return pn6Var;
            default:
                t17 t17Var = (t17) obj3;
                m37.N(obj);
                v27 v27Var = (v27) obj2;
                za0 za0Var = v27Var.p;
                sx5 sx5Var = v27Var.o;
                sx5 sx5Var2 = v27Var.n;
                ym6 ym6Var = (ym6) sx5Var2.getValue();
                Episode episode = ym6Var.b;
                boolean z = ym6Var.h;
                if (episode != null) {
                    int number = episode.getNumber();
                    v17 v17Var = new v17(number, z);
                    if (((dq4) sx5Var.getValue()).j && t17Var.b.equals(v17Var) && t17Var.equals(v27Var.K) && t17Var.c == v27Var.c0) {
                        v27Var.o(number, z);
                        String str = t17Var.a;
                        LinkedHashSet linkedHashSet = v27Var.L;
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (linkedHashSet.add(lowerCase)) {
                            bx5 bx5Var2 = v27Var.O;
                            if (bx5Var2 != null) {
                                bx5Var2.l(null);
                            }
                            v27Var.O = null;
                            v27Var.K = null;
                            v27Var.Q = false;
                            v27Var.j.a();
                            String h = v27Var.h(te4.O(str));
                            if (h == null) {
                                v27Var.l.stop();
                                v27Var.m();
                                do {
                                    value = sx5Var.getValue();
                                } while (!sx5Var.j(value, dq4.a((dq4) value, false, false, false, 0L, 0L, null, false, null, false, false, null, 1791)));
                                do {
                                    value2 = sx5Var2.getValue();
                                } while (!sx5Var2.j(value2, ym6.a((ym6) value2, null, null, null, null, null, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -1, 2)));
                                za0Var.i(new s17("No playable Cast server is available for this episode. Try again later."));
                            } else {
                                v27Var.a0(h);
                                while (true) {
                                    Object value3 = sx5Var2.getValue();
                                    String str2 = h;
                                    if (sx5Var2.j(value3, ym6.a((ym6) value3, null, null, null, null, str2, null, null, false, 0.0f, false, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, false, false, false, null, false, false, false, false, false, false, false, -17, 15))) {
                                        za0Var.i(new s17(str + " couldn't play this episode on the Cast device. Switched to " + str2 + "."));
                                        v27.w(v27Var, number, new Long(j), false, Boolean.valueOf(v27Var.S), 48);
                                    } else {
                                        h = str2;
                                    }
                                }
                            }
                        }
                    }
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t64(v27 v27Var, t17 t17Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = v27Var;
        this.A = t17Var;
        this.y = j;
    }
}
