package v0;

import android.view.ViewGroup;
import androidx.fragment.app.y;
import r6.h0;

/* loaded from: classes.dex */
public final class d extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, String str) {
        super(yVar, "Attempting to reuse fragment " + yVar + " with previous ID " + str);
        h0.u(yVar, "fragment");
        h0.u(str, "previousFragmentId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y yVar, ViewGroup viewGroup, int i10) {
        super(yVar, "Attempting to use <fragment> tag to add fragment " + yVar + " to container " + viewGroup);
        if (i10 != 1) {
            return;
        }
        h0.u(viewGroup, "container");
        super(yVar, "Attempting to add fragment " + yVar + " to container " + viewGroup + " which is not a FragmentContainerView");
    }
}
