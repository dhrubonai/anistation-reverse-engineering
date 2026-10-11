package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import java.util.AbstractList;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hf3 extends AbstractList implements RandomAccess {
    public final /* synthetic */ byte x;
    public final LazyStringArrayList y;

    public /* synthetic */ hf3(LazyStringArrayList lazyStringArrayList, byte b) {
        this.x = b;
        this.y = lazyStringArrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        byte b = this.x;
        LazyStringArrayList lazyStringArrayList = this.y;
        switch (b) {
            case 0:
                LazyStringArrayList.access$200(lazyStringArrayList, i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return;
            default:
                LazyStringArrayList.access$500(lazyStringArrayList, i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        byte b = this.x;
        LazyStringArrayList lazyStringArrayList = this.y;
        switch (b) {
            case 0:
                return lazyStringArrayList.getByteArray(i);
            default:
                return lazyStringArrayList.getByteString(i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        byte b = this.x;
        LazyStringArrayList lazyStringArrayList = this.y;
        switch (b) {
            case 0:
                String remove = lazyStringArrayList.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.access$100(remove);
            default:
                String remove2 = lazyStringArrayList.remove(i);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.access$400(remove2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.x;
        LazyStringArrayList lazyStringArrayList = this.y;
        switch (b) {
            case 0:
                Object access$000 = LazyStringArrayList.access$000(lazyStringArrayList, i, (byte[]) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.access$100(access$000);
            default:
                Object access$300 = LazyStringArrayList.access$300(lazyStringArrayList, i, (ByteString) obj);
                ((AbstractList) this).modCount++;
                return LazyStringArrayList.access$400(access$300);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        byte b = this.x;
        LazyStringArrayList lazyStringArrayList = this.y;
        switch (b) {
            case 0:
                return lazyStringArrayList.size();
            default:
                return lazyStringArrayList.size();
        }
    }
}
