package s0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class e extends q0.j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f9735a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f9736b;

    public e(TextView textView, f fVar) {
        this.f9735a = new WeakReference(textView);
        this.f9736b = new WeakReference(fVar);
    }

    @Override // q0.j
    public final void a() {
        boolean z9;
        int length;
        InputFilter[] filters;
        TextView textView = (TextView) this.f9735a.get();
        InputFilter inputFilter = (InputFilter) this.f9736b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        if (z9 && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            q0.l a10 = q0.l.a();
            if (text == null) {
                length = 0;
            } else {
                a10.getClass();
                length = text.length();
            }
            CharSequence f10 = a10.f(0, length, text);
            if (text == f10) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(f10);
            int selectionEnd = Selection.getSelectionEnd(f10);
            textView.setText(f10);
            if (f10 instanceof Spannable) {
                Spannable spannable = (Spannable) f10;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }
}
