package j3;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u0 extends FrameLayout implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f6095a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f6096b;

    /* renamed from: c, reason: collision with root package name */
    public List f6097c;

    /* renamed from: d, reason: collision with root package name */
    public d f6098d;

    /* renamed from: e, reason: collision with root package name */
    public float f6099e;

    /* renamed from: f, reason: collision with root package name */
    public int f6100f;

    /* renamed from: x, reason: collision with root package name */
    public float f6101x;

    public u0(Context context) {
        super(context, null);
        this.f6097c = Collections.emptyList();
        this.f6098d = d.f5956g;
        this.f6099e = 0.0533f;
        this.f6100f = 0;
        this.f6101x = 0.08f;
        c cVar = new c(context);
        this.f6095a = cVar;
        s0 s0Var = new s0(context);
        this.f6096b = s0Var;
        s0Var.setBackgroundColor(0);
        addView(cVar);
        addView(s0Var);
    }

    @Override // j3.o0
    public final void a(List list, d dVar, float f10, int i10, float f11) {
        this.f6098d = dVar;
        this.f6099e = f10;
        this.f6100f = i10;
        this.f6101x = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            e1.b bVar = (e1.b) list.get(i11);
            if (bVar.f3350d != null) {
                arrayList.add(bVar);
            } else {
                arrayList2.add(bVar);
            }
        }
        if (!this.f6097c.isEmpty() || !arrayList2.isEmpty()) {
            this.f6097c = arrayList2;
            c();
        }
        this.f6095a.a(arrayList, dVar, f10, i10, f11);
        invalidate();
    }

    public final String b(int i10, float f10) {
        float d02 = q6.g.d0(f10, i10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (d02 == -3.4028235E38f) {
            return "unset";
        }
        return f1.b0.m("%.2fpx", Float.valueOf(d02 / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x049c, code lost:
    
        if (((android.text.style.TypefaceSpan) r4).getFamily() != null) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x01d8, code lost:
    
        if (r3 != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x01e0, code lost:
    
        r0 = 2;
        r24 = r23;
        r23 = "top";
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x01de, code lost:
    
        r23 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x01db, code lost:
    
        if (r3 != 0) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.u0.c():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (z9 && !this.f6097c.isEmpty()) {
            c();
        }
    }
}
