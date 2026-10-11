package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.anistation.android.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h65 extends ViewGroup {
    public final pv1 A;
    public int B;
    public final byte x;
    public final ArrayList y;
    public final ArrayList z;

    public h65(Context context) {
        super(context);
        this.x = (byte) 5;
        ArrayList arrayList = new ArrayList();
        this.y = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.z = arrayList2;
        this.A = new pv1((byte) 1);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.B = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
