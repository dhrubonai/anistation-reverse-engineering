package j6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f6241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f6242d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f6241c = arrayList;
        this.f6242d = matrix;
    }

    @Override // j6.t
    public final void a(Matrix matrix, i6.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f6241c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f6242d, aVar, i10, canvas);
        }
    }
}
