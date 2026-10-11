package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ds extends xo0 {
    public final /* synthetic */ byte b;
    public final fi3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(x73 x73Var, byte b) {
        super(x73Var);
        this.b = b;
        x73Var.getClass();
        switch (b) {
            case 1:
                super(x73Var);
                aj5 descriptor = x73Var.getDescriptor();
                descriptor.getClass();
                this.c = new zr(descriptor, (byte) 2, false);
                return;
            case 2:
                super(x73Var);
                aj5 descriptor2 = x73Var.getDescriptor();
                descriptor2.getClass();
                this.c = new zr(descriptor2, (byte) 3, false);
                return;
            default:
                this.c = new zr(x73Var.getDescriptor());
                return;
        }
    }

    @Override // defpackage.n0
    public final Object a() {
        switch (this.b) {
            case 0:
                return new ArrayList();
            case 1:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // defpackage.n0
    public final int b(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // defpackage.n0
    public final void c(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.ensureCapacity(-1);
                return;
            case 1:
                ((HashSet) obj).getClass();
                return;
            default:
                ((LinkedHashSet) obj).getClass();
                return;
        }
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        byte b = this.b;
        fi3 fi3Var = this.c;
        switch (b) {
            case 0:
                return (zr) fi3Var;
            case 1:
                return (zr) fi3Var;
            default:
                return (zr) fi3Var;
        }
    }

    @Override // defpackage.n0
    public final Object h(Object obj) {
        Object obj2 = null;
        switch (this.b) {
            case 0:
                List list = (List) obj;
                if (list instanceof ArrayList) {
                    obj2 = (ArrayList) list;
                }
                if (obj2 == null) {
                    return new ArrayList(list);
                }
                return obj2;
            case 1:
                Set set = (Set) obj;
                if (set instanceof HashSet) {
                    obj2 = (HashSet) set;
                }
                if (obj2 == null) {
                    return new HashSet(set);
                }
                return obj2;
            default:
                Set set2 = (Set) obj;
                if (set2 instanceof LinkedHashSet) {
                    obj2 = (LinkedHashSet) set2;
                }
                if (obj2 == null) {
                    return new LinkedHashSet(set2);
                }
                return obj2;
        }
    }

    @Override // defpackage.n0
    public final Object i(Object obj) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // defpackage.xo0
    public final void j(int i, Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                return;
            case 1:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
