.class public final Lcom/google/android/recaptcha/internal/zzcd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/webkit/WebView;

.field private final zzb:Lp7/y;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Lp7/y;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzcd;->zza:Landroid/webkit/WebView;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzcd;->zzb:Lp7/y;

    return-void
.end method

.method public static final synthetic zza(Lcom/google/android/recaptcha/internal/zzcd;)Landroid/webkit/WebView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/recaptcha/internal/zzcd;->zza:Landroid/webkit/WebView;

    return-object p0
.end method


# virtual methods
.method public final varargs zzb(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 2

    .line 1
    array-length v0, p2

    .line 2
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, [Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/recaptcha/internal/zzcc;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p2, p0, p1, v1}, Lcom/google/android/recaptcha/internal/zzcc;-><init>([Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzcd;Ljava/lang/String;Lz6/e;)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzcd;->zzb:Lp7/y;

    .line 15
    .line 16
    invoke-static {p1, v0}, Lr6/h0;->k0(Lp7/y;Lh7/p;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
