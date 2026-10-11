package defpackage;

import com.anistation.model.download.DownloadSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ll1 extends t36 implements jc2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll1(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = 3;
        switch (b) {
            case 0:
                ll1 ll1Var = new ll1(i, (vz0) obj3, (byte) 0);
                ll1Var.y = (DownloadSettings) obj;
                ll1Var.z = (mk1) obj2;
                return ll1Var.invokeSuspend(pn6Var);
            default:
                ll1 ll1Var2 = new ll1(i, (vz0) obj3, (byte) 1);
                ll1Var2.y = (sn5) obj;
                ll1Var2.z = (j44) obj2;
                return ll1Var2.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        switch (this.x) {
            case 0:
                DownloadSettings downloadSettings = (DownloadSettings) this.y;
                mk1 mk1Var = (mk1) this.z;
                m37.N(obj);
                return new nk1(downloadSettings, mk1Var.a, mk1Var.b);
            default:
                m37.N(obj);
                sn5 sn5Var = (sn5) this.y;
                j44 j44Var = (j44) this.z;
                Set keySet = j44Var.a().keySet();
                ArrayList arrayList = new ArrayList(zo0.V(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ts4) it.next()).a);
                }
                Map<String, ?> all = sn5Var.a.getAll();
                all.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
                while (true) {
                    boolean z = true;
                    if (it2.hasNext()) {
                        Map.Entry<String, ?> next = it2.next();
                        String key = next.getKey();
                        Set set = sn5Var.b;
                        if (set != null) {
                            z = set.contains(key);
                        }
                        if (z) {
                            linkedHashMap.put(next.getKey(), next.getValue());
                        }
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(vn3.S(linkedHashMap.size()));
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object key2 = entry.getKey();
                            Object value = entry.getValue();
                            if (value instanceof Set) {
                                value = yo0.N0((Iterable) value);
                            }
                            linkedHashMap2.put(key2, value);
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            if (!arrayList.contains((String) entry2.getKey())) {
                                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        j44 j44Var2 = new j44(new LinkedHashMap(j44Var.a()), false);
                        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                            String str = (String) entry3.getKey();
                            Object value2 = entry3.getValue();
                            if (value2 instanceof Boolean) {
                                str.getClass();
                                j44Var2.f(new ts4(str), value2);
                            } else if (value2 instanceof Float) {
                                str.getClass();
                                j44Var2.f(new ts4(str), value2);
                            } else if (value2 instanceof Integer) {
                                str.getClass();
                                j44Var2.f(new ts4(str), value2);
                            } else if (value2 instanceof Long) {
                                str.getClass();
                                j44Var2.f(new ts4(str), value2);
                            } else if (value2 instanceof String) {
                                str.getClass();
                                j44Var2.f(new ts4(str), value2);
                            } else if (value2 instanceof Set) {
                                str.getClass();
                                j44Var2.f(new ts4(str), (Set) value2);
                            }
                        }
                        return new j44(new LinkedHashMap(j44Var2.a()), true);
                    }
                }
        }
    }
}
