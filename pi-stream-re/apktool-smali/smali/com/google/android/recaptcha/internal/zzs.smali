.class final Lcom/google/android/recaptcha/internal/zzs;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# direct methods
.method public constructor <init>(Lz6/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 0

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzs;

    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lz6/e;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp7/y;

    .line 2
    .line 3
    check-cast p2, Lz6/e;

    .line 4
    .line 5
    new-instance p1, Lcom/google/android/recaptcha/internal/zzs;

    .line 6
    .line 7
    invoke-direct {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;-><init>(Lz6/e;)V

    .line 8
    .line 9
    .line 10
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzs;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, La7/a;->a:La7/a;

    .line 2
    .line 3
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/16 v0, 0x8

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 13
    .line 14
    .line 15
    sget-object p1, Lw6/f;->a:Lw6/f;

    .line 16
    .line 17
    return-object p1
.end method
