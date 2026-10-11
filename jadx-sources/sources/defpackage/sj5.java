package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sj5 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ArrayList y;

    public /* synthetic */ sj5(ArrayList arrayList, byte b) {
        this.x = b;
        this.y = arrayList;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        int size;
        byte b = this.x;
        int i = 0;
        ArrayList arrayList = this.y;
        switch (b) {
            case 0:
                return ((y73) arrayList.get(0)).c();
            default:
                if (arrayList.isEmpty()) {
                    return nt1.x;
                }
                if (((CharSequence) yo0.k0(arrayList)).length() == 0 && arrayList.size() > 1) {
                    i = 1;
                }
                if (((CharSequence) yo0.r0(arrayList)).length() == 0) {
                    size = arrayList.size() - 1;
                } else {
                    size = arrayList.size();
                }
                return arrayList.subList(i, size);
        }
    }
}
