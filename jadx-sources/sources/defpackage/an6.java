package defpackage;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class an6 {
    public static final LocalDate a = LocalDate.now();
    public static final ZoneId b = ZoneId.systemDefault();
    public static final DateTimeFormatter c = DateTimeFormatter.ofPattern("MMM dd", Locale.ENGLISH);
}
