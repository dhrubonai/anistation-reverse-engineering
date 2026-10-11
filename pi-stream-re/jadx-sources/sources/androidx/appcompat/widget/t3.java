package androidx.appcompat.widget;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f651a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f652b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f653c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f654d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f655e;

    public t3(View view) {
        this.f651a = (TextView) view.findViewById(R.id.text1);
        this.f652b = (TextView) view.findViewById(R.id.text2);
        this.f653c = (ImageView) view.findViewById(R.id.icon1);
        this.f654d = (ImageView) view.findViewById(R.id.icon2);
        this.f655e = (ImageView) view.findViewById(msr.pistream.app.R.id.edit_query);
    }
}
