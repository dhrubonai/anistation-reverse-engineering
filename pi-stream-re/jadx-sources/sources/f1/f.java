package f1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3826b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3827c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3828d;

    public f(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f3825a = str;
        this.f3826b = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f3827c = unmodifiableList;
        this.f3828d = bArr;
    }

    public final int a() {
        int i10 = this.f3826b;
        if (i10 != 2) {
            if (i10 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public f(String str, int i10, int i11) {
        this.f3825a = str;
        this.f3826b = i11;
        this.f3827c = new float[16];
        this.f3828d = new int[4];
    }
}
