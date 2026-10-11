package b2;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f1345a;

    /* renamed from: b, reason: collision with root package name */
    public int f1346b;

    /* renamed from: c, reason: collision with root package name */
    public int f1347c;

    public j(z3.i iVar) {
        Context context = iVar.f12049a;
        ActivityManager activityManager = iVar.f12050b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f1347c = i10;
        int round = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) iVar.f12051c.f6453b;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = iVar.f12052d;
        int round2 = Math.round(f10 * f11);
        int round3 = Math.round(f10 * 2.0f);
        int i11 = round - i10;
        int i12 = round3 + round2;
        if (i12 <= i11) {
            this.f1346b = round3;
            this.f1345a = round2;
        } else {
            float f12 = i11 / (f11 + 2.0f);
            this.f1346b = Math.round(2.0f * f12);
            this.f1345a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(context, this.f1346b));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(context, this.f1345a));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(context, i10));
            sb.append(", memory class limited? ");
            sb.append(i12 > round);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(context, round));
            sb.append(", memoryClass: ");
            sb.append(activityManager.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    public j(int i10, int i11, int i12) {
        this.f1345a = i10;
        this.f1346b = i11;
        this.f1347c = i12;
    }
}
