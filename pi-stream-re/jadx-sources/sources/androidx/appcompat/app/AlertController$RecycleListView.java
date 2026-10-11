package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f290a;

    /* renamed from: b, reason: collision with root package name */
    public final int f291b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f3288t);
        this.f291b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f290a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
