package q7;

import android.os.Looper;
import java.util.List;
import p7.m1;
import t7.r;

/* loaded from: classes.dex */
public final class a implements r {
    @Override // t7.r
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // t7.r
    public m1 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new d(e.a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // t7.r
    public int c() {
        return 1073741823;
    }
}
