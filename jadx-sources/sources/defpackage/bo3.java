package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bo3 extends r1 {
    public final /* synthetic */ byte x = 0;
    public final Object y;

    public bo3(List list) {
        list.getClass();
        this.y = list;
    }

    @Override // defpackage.m0
    public final int b() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((do3) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.x) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                String group = ((do3) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(yo0.w0(i, this));
        }
    }

    @Override // defpackage.r1, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.x) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.r1, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.x) {
            case 1:
                return new r55(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.r1, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.x) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.r1, java.util.List
    public ListIterator listIterator() {
        switch (this.x) {
            case 1:
                return new r55(this, 0);
            default:
                return super.listIterator();
        }
    }

    public bo3(do3 do3Var) {
        this.y = do3Var;
    }

    @Override // defpackage.r1, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.x) {
            case 1:
                return new r55(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
