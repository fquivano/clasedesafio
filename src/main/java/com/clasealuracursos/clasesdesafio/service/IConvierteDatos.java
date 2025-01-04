package com.clasealuracursos.clasesdesafio.service;

public interface IConvierteDatos {
    <T>T obtenerDatos(String json, Class<T> clase);
}
