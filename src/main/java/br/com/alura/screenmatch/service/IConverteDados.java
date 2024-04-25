package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe); // Como que se fosse um .toJson (fromJson, Transforma em uma classe)
}
