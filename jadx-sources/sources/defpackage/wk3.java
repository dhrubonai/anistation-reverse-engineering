package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wk3 {
    public static final /* synthetic */ wk3[] x = {new Enum("Verbose", 0), new Enum("Debug", 1), new Enum("Info", 2), new Enum("Warn", 3), new Enum("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    wk3 EF5;

    public static wk3 valueOf(String str) {
        return (wk3) Enum.valueOf(wk3.class, str);
    }

    public static wk3[] values() {
        return (wk3[]) x.clone();
    }
}
