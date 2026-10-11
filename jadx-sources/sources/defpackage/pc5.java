package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pc5 implements rc5 {
    public final ScrollFeedbackProvider x;

    public pc5(NestedScrollView nestedScrollView) {
        this.x = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.rc5
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.x.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.rc5
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.x.onScrollProgress(i, i2, i3, i4);
    }
}
