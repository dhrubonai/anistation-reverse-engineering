package p1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8430c = {8, 13, 11, 2, 0, 1, 7};

    /* renamed from: b, reason: collision with root package name */
    public final w1.o f8431b = new w1.o(7);

    public static void a(int i10, ArrayList arrayList) {
        int[] iArr = f8430c;
        int i11 = 0;
        while (true) {
            if (i11 < 7) {
                if (iArr[i11] == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 != -1 && !arrayList.contains(Integer.valueOf(i10))) {
            arrayList.add(Integer.valueOf(i10));
        }
    }
}
