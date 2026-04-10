# 1. Define as variáveis de caminho
$javaPath = "D:\jdk\jdk-21"
$javaBin = "$javaPath\bin"

# 2. Cria ou atualiza a variável JAVA_HOME (Escopo de Usuário)
[Environment]::SetEnvironmentVariable("JAVA_HOME", $javaPath, "User")
Write-Host "JAVA_HOME configurado para: $javaPath" -ForegroundColor Cyan

# 3. Adiciona o diretório bin ao PATH do Usuário (se já não estiver lá)
$oldPath = [Environment]::GetEnvironmentVariable("Path", "User")

if ($oldPath -notlike "*$javaBin*") {
    $newPath = "$javaBin;$oldPath"
    [Environment]::SetEnvironmentVariable("Path", $newPath, "User")
    Write-Host "Diretório bin adicionado ao Path com sucesso!" -ForegroundColor Green
} else {
    Write-Host "O diretório bin já consta no Path." -ForegroundColor Yellow
}

# Avisar que é necessário reiniciar o terminal para aplicar
Write-Host "Configuração concluída. Reinicie seu terminal/IDE para aplicar as mudanças." -ForegroundColor Magenta