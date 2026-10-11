package defpackage;

import com.anistation.local.dao.AnimeListDao_Impl;
import com.anistation.local.entity.AnimeListItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vm implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ int z;

    public /* synthetic */ vm(ic2 ic2Var, String str, int i) {
        this.x = (byte) 1;
        this.A = ic2Var;
        this.y = str;
        this.z = i;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        AnimeListItem observeByIdentity$lambda$0;
        pu0 pu0Var;
        pu0 pu0Var2;
        int i;
        boolean z;
        boolean z2;
        int i2;
        bd6 bd6Var;
        byte b = this.x;
        int i3 = 0;
        pn6 pn6Var = pn6.a;
        int i4 = this.z;
        Object obj2 = this.A;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                observeByIdentity$lambda$0 = AnimeListDao_Impl.observeByIdentity$lambda$0("\n        SELECT * FROM anime_list\n        WHERE animeId = ? OR\n            (? > 0 AND anilistId = ?)\n        ORDER BY CASE WHEN animeId = ? THEN 0 ELSE 1 END\n        LIMIT 1\n        ", (String) obj3, i4, (AnimeListDao_Impl) obj2, (g85) obj);
                return observeByIdentity$lambda$0;
            case 1:
                ((String) obj).getClass();
                ((ic2) obj2).invoke((String) obj3, Integer.valueOf(i4));
                return pn6Var;
            case 2:
                zz4 zz4Var = (zz4) obj3;
                b44 b44Var = (b44) obj2;
                pu0 pu0Var3 = (pu0) obj;
                if (zz4Var.e == i4 && a34.i(b44Var, zz4Var.f) && (pu0Var3 instanceof vu0)) {
                    long[] jArr = b44Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = b44Var.b[i9];
                                        if (b44Var.c[i9] != i4) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            i = i6;
                                            vu0 vu0Var = (vu0) pu0Var3;
                                            pu0Var2 = pu0Var3;
                                            p44 p44Var = vu0Var.D;
                                            x97.M(p44Var, obj4, zz4Var);
                                            z2 = z;
                                            if (obj4 instanceof he1) {
                                                he1 he1Var = (he1) obj4;
                                                if (!p44Var.c(he1Var)) {
                                                    x97.N(vu0Var.G, he1Var);
                                                }
                                                p44 p44Var2 = zz4Var.g;
                                                if (p44Var2 != null) {
                                                    p44Var2.l(obj4);
                                                }
                                            }
                                        } else {
                                            pu0Var2 = pu0Var3;
                                            z2 = z;
                                            i = i6;
                                        }
                                        if (z2) {
                                            b44Var.f(i9);
                                        }
                                    } else {
                                        pu0Var2 = pu0Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    pu0Var3 = pu0Var2;
                                }
                                pu0Var = pu0Var3;
                                if (i7 != i6) {
                                }
                            } else {
                                pu0Var = pu0Var3;
                            }
                            if (i5 != length) {
                                i5++;
                                pu0Var3 = pu0Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                return pn6Var;
            case 3:
                uc5 uc5Var = (uc5) obj3;
                em4 em4Var = (em4) obj2;
                dm4 dm4Var = (dm4) obj;
                int h = uc5Var.L.a.h();
                if (h < 0) {
                    h = 0;
                }
                if (h <= i4) {
                    i4 = h;
                }
                int i10 = -i4;
                boolean z3 = uc5Var.M;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = i10;
                }
                if (!z3) {
                    i10 = 0;
                }
                dm4Var.x = true;
                dm4.k(dm4Var, em4Var, i2, i10);
                dm4Var.x = false;
                return pn6Var;
            default:
                gs6 gs6Var = (gs6) obj3;
                em4 em4Var2 = (em4) obj2;
                dm4 dm4Var2 = (dm4) obj;
                int i11 = gs6Var.y;
                cb6 cb6Var = gs6Var.x;
                di6 di6Var = gs6Var.z;
                cd6 cd6Var = (cd6) gs6Var.A.invoke();
                if (cd6Var != null) {
                    bd6Var = cd6Var.a;
                } else {
                    bd6Var = null;
                }
                cb6Var.a(rg4.x, xt5.c(dm4Var2, i11, di6Var, bd6Var, false, em4Var2.x), i4, em4Var2.y);
                dm4.j(dm4Var2, em4Var2, 0, Math.round(-cb6Var.a.h()));
                return pn6Var;
        }
    }

    public /* synthetic */ vm(byte b, int i, Object obj, Object obj2) {
        this.x = b;
        this.y = obj;
        this.z = i;
        this.A = obj2;
    }

    public /* synthetic */ vm(gs6 gs6Var, em4 em4Var, int i) {
        this.x = (byte) 4;
        this.y = gs6Var;
        this.A = em4Var;
        this.z = i;
    }
}
