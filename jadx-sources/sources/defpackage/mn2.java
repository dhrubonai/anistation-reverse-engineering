package defpackage;

import com.anistation.model.Resource;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mn2 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ rn2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mn2(rn2 rn2Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = rn2Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        rn2 rn2Var = this.z;
        switch (b) {
            case 0:
                mn2 mn2Var = new mn2(rn2Var, str, vz0Var, (byte) 0);
                mn2Var.y = obj;
                return mn2Var;
            default:
                mn2 mn2Var2 = new mn2(rn2Var, str, vz0Var, (byte) 1);
                mn2Var2.y = obj;
                return mn2Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Resource resource = (Resource) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((mn2) create(resource, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((mn2) create(resource, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        tm6 tm6Var;
        Map map;
        Object value2;
        tm6 tm6Var2;
        Map map2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        String str = this.A;
        rn2 rn2Var = this.z;
        Resource resource = (Resource) this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                sx5 sx5Var = rn2Var.e;
                do {
                    value = sx5Var.getValue();
                    tm6Var = (tm6) value;
                    Map map3 = tm6Var.a;
                    map3.getClass();
                    if (map3.isEmpty()) {
                        map = Collections.singletonMap(str, resource);
                        map.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map3);
                        linkedHashMap.put(str, resource);
                        map = linkedHashMap;
                    }
                } while (!sx5Var.j(value, tm6.a(tm6Var, map, null, 0, null, null, false, 62)));
                return pn6Var;
            default:
                m37.N(obj);
                if (!(resource instanceof Resource.Loading)) {
                    sx5 sx5Var2 = rn2Var.e;
                    do {
                        value2 = sx5Var2.getValue();
                        tm6Var2 = (tm6) value2;
                        Map map4 = tm6Var2.a;
                        map4.getClass();
                        if (map4.isEmpty()) {
                            map2 = Collections.singletonMap(str, resource);
                            map2.getClass();
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap(map4);
                            linkedHashMap2.put(str, resource);
                            map2 = linkedHashMap2;
                        }
                    } while (!sx5Var2.j(value2, tm6.a(tm6Var2, map2, null, 0, null, null, false, 30)));
                }
                return pn6Var;
        }
    }
}
