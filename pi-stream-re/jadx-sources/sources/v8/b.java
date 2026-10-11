package v8;

import android.widget.PopupWindow;
import c1.g1;
import c1.l1;
import c1.m1;
import j1.d0;
import j1.p;
import w8.d;
import y1.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final n8.a f10696a;

    public b(n8.a aVar) {
        this.f10696a = aVar;
    }

    public static void a(b bVar, int i10, int i11, String str, PopupWindow popupWindow) {
        n8.a aVar = bVar.f10696a;
        p f10 = aVar.f();
        if (f10 != null) {
            try {
                d0 d0Var = (d0) f10;
                y1.p pVar = (y1.p) d0Var.J();
                m1 B = d0Var.B();
                if (B != null && i10 < B.a().size()) {
                    l1 l1Var = (l1) B.a().get(i10);
                    if (i11 < l1Var.f1801a) {
                        i d10 = pVar.d();
                        d10.j(false);
                        d10.g(new g1(l1Var.a(), i11));
                        pVar.n(d10);
                        if (str == null || str.isEmpty()) {
                            str = "subtitle";
                        }
                        aVar.C("Loading " + str + "…");
                    }
                }
            } catch (Exception e10) {
                d.b(e10);
            }
        }
        popupWindow.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.b():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:8|(2:10|(12:12|(10:16|17|18|19|(4:21|22|(5:24|25|(3:29|(4:32|(2:68|69)(8:(3:60|61|(1:65))|37|(1:39)|40|41|42|43|44)|45|30)|70)|27|28)|73)(1:75)|(1:53)|54|(1:57)|58|59)|78|17|18|19|(0)(0)|(1:53)|54|(1:57)|58|59))|79|78|17|18|19|(0)(0)|(0)|54|(0)|58|59) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0132, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0133, code lost:
    
        r1 = false;
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[Catch: Exception -> 0x0132, TRY_LEAVE, TryCatch #3 {Exception -> 0x0132, blocks: (B:19:0x006f, B:21:0x0077), top: B:18:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.c():void");
    }
}
