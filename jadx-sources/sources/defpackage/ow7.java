package defpackage;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ow7 extends ti7 {
    public final Object A;
    public final /* synthetic */ byte z = 4;

    public ow7(fq3 fq3Var) {
        super("internal.logger");
        this.A = fq3Var;
        this.y.put("log", new b58(this, false, true));
        this.y.put("silent", new rz7("silent", (byte) 1));
        ((ti7) this.y.get("silent")).g("log", new b58(this, true, true));
        this.y.put("unmonitored", new rz7("unmonitored", (byte) 2));
        ((ti7) this.y.get("unmonitored")).g("log", new b58(this, false, false));
    }

    @Override // defpackage.ti7
    public final ik7 a(vs7 vs7Var, List list) {
        HashMap hashMap;
        Object obj;
        int i;
        TreeMap treeMap;
        byte b = this.z;
        String str = this.x;
        xk7 xk7Var = ik7.p;
        Object obj2 = this.A;
        String str2 = null;
        switch (b) {
            case 0:
                fy5.k(str, 3, list);
                String d = ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(0)).d();
                ik7 ik7Var = (ik7) list.get(1);
                y23 y23Var = (y23) vs7Var.b;
                long r = (long) fy5.r(y23Var.f0(vs7Var, ik7Var).h().doubleValue());
                ik7 f0 = y23Var.f0(vs7Var, (ik7) list.get(2));
                if (f0 instanceof zj7) {
                    hashMap = fy5.t((zj7) f0);
                } else {
                    hashMap = new HashMap();
                }
                l87 l87Var = (l87) obj2;
                l87Var.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str3 : hashMap.keySet()) {
                    HashMap hashMap3 = ((mc7) l87Var.y).c;
                    if (hashMap3.containsKey(str3)) {
                        obj = hashMap3.get(str3);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str3, mc7.b(str3, obj, hashMap.get(str3)));
                }
                ((ArrayList) l87Var.A).add(new mc7(d, r, hashMap2));
                return xk7Var;
            case 1:
                fy5.k("getValue", 2, list);
                ik7 f02 = ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(0));
                ik7 f03 = ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(1));
                String d2 = f02.d();
                ht7 ht7Var = (ht7) obj2;
                Map map = (Map) ((nt7) ht7Var.y).A.get((String) ht7Var.x);
                if (map != null && map.containsKey(d2)) {
                    str2 = (String) map.get(d2);
                }
                if (str2 != null) {
                    return new tk7(str2);
                }
                return f03;
            case 2:
                return xk7Var;
            case 3:
                try {
                    return nz5.e(((it7) obj2).call());
                } catch (Exception unused) {
                    return xk7Var;
                }
            default:
                fy5.k(str, 3, list);
                ((y23) vs7Var.b).f0(vs7Var, (ik7) list.get(0)).d();
                ik7 ik7Var2 = (ik7) list.get(1);
                y23 y23Var2 = (y23) vs7Var.b;
                ik7 f04 = y23Var2.f0(vs7Var, ik7Var2);
                if (f04 instanceof gk7) {
                    ik7 f05 = y23Var2.f0(vs7Var, (ik7) list.get(2));
                    if (f05 instanceof zj7) {
                        zj7 zj7Var = (zj7) f05;
                        HashMap hashMap4 = zj7Var.x;
                        if (hashMap4.containsKey(HandleInvocationsFromAdViewer.KEY_AD_TYPE)) {
                            String d3 = zj7Var.b(HandleInvocationsFromAdViewer.KEY_AD_TYPE).d();
                            if (hashMap4.containsKey(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)) {
                                i = fy5.q(zj7Var.b(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).h().doubleValue());
                            } else {
                                i = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
                            }
                            fk7 fk7Var = (fk7) obj2;
                            gk7 gk7Var = (gk7) f04;
                            fk7Var.getClass();
                            if ("create".equals(d3)) {
                                treeMap = (TreeMap) fk7Var.y;
                            } else if ("edit".equals(d3)) {
                                treeMap = (TreeMap) fk7Var.x;
                            } else {
                                ze0.m("Unknown callback type: ".concat(String.valueOf(d3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i))) {
                                i = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i), gk7Var);
                            return xk7Var;
                        }
                        ze0.k("Undefined rule type");
                    } else {
                        ze0.k("Invalid callback params");
                    }
                } else {
                    ze0.k("Invalid callback type");
                }
                return null;
        }
    }

    public ow7(l87 l87Var) {
        super("internal.eventLogger");
        this.A = l87Var;
    }

    public ow7(fk7 fk7Var) {
        super("internal.registerCallback");
        this.A = fk7Var;
    }

    public ow7(it7 it7Var) {
        super("internal.appMetadata");
        this.A = it7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow7(rz7 rz7Var, ht7 ht7Var) {
        super("getValue");
        this.A = ht7Var;
    }
}
