package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class es extends AbstractSet {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ es(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((fs5) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((gs5) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((zg7) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 1:
                ((fs5) obj).clear();
                return;
            case 2:
                ((gs5) obj).clear();
                return;
            case 3:
                ((zg7) obj).clear();
                return;
            default:
                super.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((fs5) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 == value) {
                    return true;
                }
                if (obj3 != null && obj3.equals(value)) {
                    return true;
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((gs5) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 == value2) {
                    return true;
                }
                if (obj4 != null && obj4.equals(value2)) {
                    return true;
                }
                return false;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((zg7) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 == value3) {
                    return true;
                }
                if (obj5 != null && obj5.equals(value3)) {
                    return true;
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        byte b = this.x;
        byte b2 = 1;
        Object obj = this.y;
        switch (b) {
            case 0:
                return new hs((js) obj);
            case 1:
                return new ns5((fs5) obj, (byte) 0);
            case 2:
                return new ns5((gs5) obj, b2);
            case 3:
                return new ns5((zg7) obj, (byte) 2);
            default:
                return new rd7(this, b2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((fs5) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((gs5) obj2).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((zg7) obj2).remove(entry3.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((js) obj).z;
            case 1:
                return ((fs5) obj).size();
            case 2:
                return ((gs5) obj).size();
            case 3:
                return ((zg7) obj).size();
            default:
                return ((tb8) obj).e;
        }
    }
}
