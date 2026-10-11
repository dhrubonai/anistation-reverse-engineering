package j3;

import android.view.View;
import android.widget.TextView;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class s extends a1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f6084u;

    /* renamed from: v, reason: collision with root package name */
    public final View f6085v;

    public s(View view) {
        super(view);
        if (f1.b0.f3799a < 26) {
            view.setFocusable(true);
        }
        this.f6084u = (TextView) view.findViewById(R.id.exo_text);
        this.f6085v = view.findViewById(R.id.exo_check);
    }
}
