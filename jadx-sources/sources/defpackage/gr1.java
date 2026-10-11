package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gr1 extends View {
    public final /* synthetic */ fr1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr1(fr1 fr1Var, Context context) {
        super(context);
        this.x = fr1Var;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.x.run();
    }
}
