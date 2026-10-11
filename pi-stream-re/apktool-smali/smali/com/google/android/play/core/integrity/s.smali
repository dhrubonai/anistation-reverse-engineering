.class final Lcom/google/android/play/core/integrity/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/s;

.field private final b:Lp6/h;

.field private final c:Lp6/h;

.field private final d:Lp6/h;

.field private final e:Lp6/h;

.field private final f:Lp6/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/google/android/play/core/integrity/s;->a:Lcom/google/android/play/core/integrity/s;

    .line 5
    .line 6
    new-instance p2, Landroidx/fragment/app/o;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p2, p1}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->b:Lp6/h;

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/play/core/integrity/an;->a()Lcom/google/android/play/core/integrity/ao;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->c:Lp6/h;

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/play/core/integrity/az;

    .line 26
    .line 27
    invoke-direct {v0, p2, p1}, Lcom/google/android/play/core/integrity/az;-><init>(Lp6/h;Lp6/h;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->d:Lp6/h;

    .line 35
    .line 36
    new-instance p2, Lcom/google/android/play/core/integrity/be;

    .line 37
    .line 38
    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/be;-><init>(Lp6/h;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    iput-object p2, p0, Lcom/google/android/play/core/integrity/s;->e:Lp6/h;

    .line 46
    .line 47
    new-instance v0, Lcom/google/android/play/core/integrity/am;

    .line 48
    .line 49
    invoke-direct {v0, p1, p2}, Lcom/google/android/play/core/integrity/am;-><init>(Lp6/h;Lp6/h;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object p1, p0, Lcom/google/android/play/core/integrity/s;->f:Lp6/h;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 60
    .line 61
    const-string p2, "instance cannot be null"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/StandardIntegrityManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/s;->f:Lp6/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/play/core/integrity/StandardIntegrityManager;

    .line 8
    .line 9
    return-object v0
.end method
