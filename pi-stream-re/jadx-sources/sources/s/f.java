package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f9639a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9640b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9641c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9642d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9643e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.f9639a = Float.NaN;
        this.f9640b = Float.NaN;
        this.f9641c = Float.NaN;
        this.f9642d = Float.NaN;
        this.f9643e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f9722i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f9643e);
                this.f9643e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new m().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9642d = obtainStyledAttributes.getDimension(index, this.f9642d);
            } else if (index == 2) {
                this.f9640b = obtainStyledAttributes.getDimension(index, this.f9640b);
            } else if (index == 3) {
                this.f9641c = obtainStyledAttributes.getDimension(index, this.f9641c);
            } else if (index == 4) {
                this.f9639a = obtainStyledAttributes.getDimension(index, this.f9639a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
