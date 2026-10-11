package p1;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8432a = 4;

    public e(int i10) {
        super(i10, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > this.f8432a) {
            return true;
        }
        return false;
    }
}
