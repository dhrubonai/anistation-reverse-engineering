package w8;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11047a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f11047a) {
            case 0:
                if (str.startsWith("crash_") && str.endsWith(".txt")) {
                    return true;
                }
                return false;
            case 1:
                if (str.startsWith("crash_") && str.endsWith(".txt")) {
                    return true;
                }
                return false;
            default:
                if (str.startsWith("crash_") && str.endsWith(".txt")) {
                    return true;
                }
                return false;
        }
    }
}
