package defpackage;

import com.anistation.model.animelist.WatchStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dh2 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh2(Set set, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = set;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Set set = this.z;
        switch (b) {
            case 0:
                dh2 dh2Var = new dh2(set, vz0Var, (byte) 0);
                dh2Var.y = obj;
                return dh2Var;
            default:
                dh2 dh2Var2 = new dh2(set, vz0Var, (byte) 1);
                dh2Var2.y = obj;
                return dh2Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        j44 j44Var = (j44) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((dh2) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((dh2) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        Set set = this.z;
        switch (b) {
            case 0:
                j44 j44Var = (j44) this.y;
                m37.N(obj);
                hh2.d.getClass();
                ts4 ts4Var = hh2.s;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((WatchStatus) it.next()).name());
                }
                j44Var.e(ts4Var, linkedHashSet);
                return pn6.a;
            default:
                m37.N(obj);
                Set keySet = ((j44) this.y).a().keySet();
                ArrayList arrayList = new ArrayList(zo0.V(keySet, 10));
                Iterator it2 = keySet.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ts4) it2.next()).a);
                }
                boolean z = true;
                if (set != qn5.a) {
                    Set set2 = set;
                    if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                        Iterator it3 = set2.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList.contains((String) it3.next())) {
                            }
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
