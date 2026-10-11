package j3;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends View implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5947a;

    /* renamed from: b, reason: collision with root package name */
    public List f5948b;

    /* renamed from: c, reason: collision with root package name */
    public int f5949c;

    /* renamed from: d, reason: collision with root package name */
    public float f5950d;

    /* renamed from: e, reason: collision with root package name */
    public d f5951e;

    /* renamed from: f, reason: collision with root package name */
    public float f5952f;

    public c(Context context) {
        super(context, null);
        this.f5947a = new ArrayList();
        this.f5948b = Collections.emptyList();
        this.f5949c = 0;
        this.f5950d = 0.0533f;
        this.f5951e = d.f5956g;
        this.f5952f = 0.08f;
    }

    @Override // j3.o0
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f5948b = list;
        this.f5951e = dVar;
        this.f5950d = f10;
        this.f5949c = i10;
        this.f5952f = f11;
        while (true) {
            ArrayList arrayList = this.f5947a;
            if (arrayList.size() < list.size()) {
                arrayList.add(new n0(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x043b, code lost:
    
        if (r6 < r3) goto L186;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r44) {
        /*
            Method dump skipped, instructions count: 1315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.c.dispatchDraw(android.graphics.Canvas):void");
    }
}
