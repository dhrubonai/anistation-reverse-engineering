.class final Lcom/google/android/recaptcha/internal/zzb;
.super Lb7/h;
.source "SourceFile"

# interfaces
.implements Lh7/p;


# instance fields
.field zza:I

.field final synthetic zzb:Lcom/google/android/recaptcha/internal/zza;

.field final synthetic zzc:Ljava/lang/String;

.field final synthetic zzd:J


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zza;Ljava/lang/String;JLz6/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zza;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    invoke-direct {p0, p5}, Lb7/h;-><init>(Lz6/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lz6/e;)Lz6/e;
    .locals 6

    .line 1
    new-instance p1, Lcom/google/android/recaptcha/internal/zzb;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zza;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzb;-><init>(Lcom/google/android/recaptcha/internal/zza;Ljava/lang/String;JLz6/e;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzb;->create(Ljava/lang/Object;Lz6/e;)Lz6/e;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object p2, Lw6/f;->a:Lw6/f;

    .line 10
    .line 11
    check-cast p1, Lcom/google/android/recaptcha/internal/zzb;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, La7/a;->a:La7/a;

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 4
    .line 5
    invoke-static {p1}, Lr6/h0;->V0(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast p1, Lw6/d;

    .line 11
    .line 12
    iget-object p1, p1, Lw6/d;->a:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzb:Lcom/google/android/recaptcha/internal/zza;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzb;->zzc:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzb;->zzd:J

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    iput v4, p0, Lcom/google/android/recaptcha/internal/zzb;->zza:I

    .line 23
    .line 24
    invoke-interface {p1, v1, v2, v3, p0}, Lcom/google/android/recaptcha/internal/zza;->zza(Ljava/lang/String;JLz6/e;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_1
    :goto_0
    new-instance v0, Lw6/d;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Lw6/d;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method
