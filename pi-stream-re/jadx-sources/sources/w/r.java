package w;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import q0.a0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public Object f10721a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10722b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.i f10723c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10724d = null;

    public r(i.g gVar, j6.e eVar, q0.e eVar2) {
        this.f10721a = eVar;
        this.f10722b = gVar;
        this.f10723c = eVar2;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z9) {
        boolean z10;
        a0[] a0VarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && (a0VarArr = (a0[]) editable.getSpans(selectionStart, selectionEnd, a0.class)) != null && a0VarArr.length > 0) {
            for (a0 a0Var : a0VarArr) {
                int spanStart = editable.getSpanStart(a0Var);
                int spanEnd = editable.getSpanEnd(a0Var);
                if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i10, int i11, q0.r rVar) {
        int i12;
        if (rVar.f8943c == 0) {
            q0.i iVar = this.f10723c;
            r0.a d10 = rVar.d();
            int a10 = d10.a(8);
            if (a10 != 0) {
                d10.f9299b.getShort(a10 + d10.f9298a);
            }
            q0.e eVar = (q0.e) iVar;
            eVar.getClass();
            ThreadLocal threadLocal = q0.e.f8914b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i10 < i11) {
                sb.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = eVar.f8915a;
            String sb2 = sb.toString();
            int i13 = z.f.f11860a;
            if (z.e.a(textPaint, sb2)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            rVar.f8943c = i12;
        }
        if (rVar.f8943c != 2) {
            return false;
        }
        return true;
    }
}
