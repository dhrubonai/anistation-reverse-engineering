package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ok7 implements Iterator {
    public final /* synthetic */ byte x;
    public int y = 0;
    public final /* synthetic */ Object z;

    public /* synthetic */ ok7(Object obj, byte b) {
        this.x = b;
        this.z = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                if (this.y >= ((tk7) obj).x.length()) {
                    return false;
                }
                return true;
            case 1:
                if (this.y >= ((tk7) obj).x.length()) {
                    return false;
                }
                return true;
            default:
                if (this.y >= ((rf7) obj).p()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                String str = ((tk7) obj).x;
                int i = this.y;
                if (i < str.length()) {
                    this.y = i + 1;
                    return new tk7(String.valueOf(i));
                }
                qi2.e();
                return null;
            case 1:
                String str2 = ((tk7) obj).x;
                int i2 = this.y;
                if (i2 < str2.length()) {
                    this.y = i2 + 1;
                    return new tk7(String.valueOf(str2.charAt(i2)));
                }
                qi2.e();
                return null;
            default:
                rf7 rf7Var = (rf7) obj;
                int i3 = this.y;
                int p = rf7Var.p();
                int i4 = this.y;
                if (i3 < p) {
                    this.y = i4 + 1;
                    return rf7Var.q(i4);
                }
                p65.h(h11.g(i4, "Out of bounds index: ", new StringBuilder(String.valueOf(i4).length() + 21)));
                return null;
        }
    }
}
